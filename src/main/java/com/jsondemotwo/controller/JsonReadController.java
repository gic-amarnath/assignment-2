package com.jsondemotwo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsondemotwo.pojo.InputJsonData;
import com.jsondemotwo.pojo.RootData;
import com.jsondemotwo.repository.RootDataRepo;
import com.jsondemotwo.service.JsonServiceProvider;

@RestController
@RequestMapping("/api/jsondata")
public class JsonReadController {
	@Autowired 
	JsonServiceProvider jsonServiceProvider;
	@Autowired
	RootDataRepo rootDataRepo;
	ObjectMapper mapper=new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	@PostMapping(path="/saveJson")
	public RootData saveJson(@RequestBody RootData rootData) {
		JsonNode root1=null;
		try {
			String strin=mapper.writeValueAsString(rootData);
			root1=mapper.readValue(strin, JsonNode.class);
			System.out.println("root1 :::: >> "+root1);

		}catch(Exception e) {

		}
		jsonServiceProvider.saveJson(root1);
		return rootData;
	}

	@GetMapping("/data/{id}")
	public ResponseEntity<?> getRootMetaData(@PathVariable Long id){
		String msg="Id not found";
		InputJsonData inputJsonData=jsonServiceProvider.findByIdStatus(id);//.orElseThrow(()-> new RuntimeException("Given Id in not found in DB : "+id));
		System.out.println("Return  >> "+inputJsonData);
		if(inputJsonData==null) {
			return ResponseEntity.ok(msg);
		}else {
			jsonServiceProvider.jsonDataChange(inputJsonData);
			return ResponseEntity.ok(inputJsonData);
		}

	}

}

