package com.jsondemotwo.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.jsondemotwo.pojo.InputJsonData;
import com.jsondemotwo.pojo.RootData;

@Service
public interface JsonServiceProvider {
	//public RootData saveJsonData(RootData rootData);
	//public void jsonModify();
	
	public InputJsonData saveJson(JsonNode jsonNode);
	public InputJsonData findByIdStatus(Long id);
	public void jsonDataChange(InputJsonData jsonD);
}
