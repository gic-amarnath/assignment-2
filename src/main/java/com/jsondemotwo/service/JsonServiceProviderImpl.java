package com.jsondemotwo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jsondemotwo.pojo.ComponentScoping;
import com.jsondemotwo.pojo.Components;
import com.jsondemotwo.pojo.DataDatum;
import com.jsondemotwo.pojo.InputJsonData;
import com.jsondemotwo.pojo.MultiEngineResults;
import com.jsondemotwo.pojo.Records;
import com.jsondemotwo.pojo.RootData;
import com.jsondemotwo.pojo.TaskSpecs;
import com.jsondemotwo.repository.RootDataRepo;

@Service
public class JsonServiceProviderImpl implements JsonServiceProvider {
	private static final ObjectMapper mapper=new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;
	@Autowired
	RootDataRepo rootDataRepo;

	@Override
	public InputJsonData saveJson(JsonNode jsonNode) {
		InputJsonData inpuData=new InputJsonData();
		inpuData.setStatus("New");
		inpuData.setData(jsonNode);
		// TODO Auto-generated method stub
		return rootDataRepo.save(inpuData);
	}

	@Override
	public InputJsonData findByIdStatus(Long id) {
		// TODO Auto-generated method stub
		String status="New";
		InputJsonData inputJsonData=null;
		List<InputJsonData> inputJsonDataRet=null;
		inputJsonDataRet=rootDataRepo.findByIdAndNewStatus(id,status);
		if(inputJsonDataRet.size()>0) {
			inputJsonData=inputJsonDataRet.get(0);
			inputJsonData.setStatus("processing");
		}
		return  inputJsonData;
	}

	@Override
	public void jsonDataChange(InputJsonData jsonD) {
		// TODO Auto-generated method stub
		try {

			JsonNode node=mapper.convertValue(jsonD, JsonNode.class);
			ObjectNode rtObj=(ObjectNode) node;
			List<JsonNode> dataSt=StreamSupport.stream(rtObj.get("data").spliterator(), false).collect(Collectors.toList());
			System.out.println("11111 :::: "+dataSt);
			JsonNode taskSpckNode=dataSt.get(0).get(0).get("taskSpecs");
			System.out.println("222222222 :: "+taskSpckNode);
			//System.out.println("taskSpckNode >>> "+taskSpckNode);
//			if(taskSpckNode!=null) {
//				ObjectNode objNode=(ObjectNode) dataSt.get(0);
//				objNode.set("result", taskSpckNode);
//				objNode.remove("taskSpecs");
//			}
			readJsonFile(taskSpckNode);


		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

	private void readJsonFile(JsonNode taskSpckNode) {
		System.out.println("------RootData--------");
		//RootData roots=null;
		try {
			MultiEngineResults multiEngResults=new MultiEngineResults();
			JsonNode data=taskSpckNode;
			System.out.println("datttttttttt >>> "+data);
			ObjectNode rtObj=(ObjectNode) data;
			List<JsonNode> dataSt=StreamSupport.stream(rtObj.get("ComponentScoping").spliterator(), false).collect(Collectors.toList());
			JsonNode data1=dataSt.get(0);
			System.out.println("dataSt.get(0) ==== "+dataSt.get(0));
			System.out.println("dataSt.get(1) ==== "+dataSt.get(1));
			
			System.out.println("dataSt ==== "+dataSt);
			
//			dataSt.forEach(dt ->{
//				Components comp=dt.ge
//			});
			//			data1.forEach(dt ->{d
			//				TaskSpecs tskSpcks=dt.getTaskSpecs();
			//				List<ComponentScoping> compScoping=tskSpcks.getComponentScoping();
			//				for (ComponentScoping comptSco : compScoping) {
			//					List<Components> components=comptSco.getComponents();
			//					for(Components compNen :components ) {
			//						List<Records> records=compNen.getRecord();
			//						for (Records reco : records) {
			//							List<String> resu=reco.getRuleResult().getResult();
			//							for(String finalResults :resu) {
			//								System.out.println("finalResults :: "+finalResults);
			//								if("Include".equalsIgnoreCase(finalResults)) {
			//									multiEngResults.setCbvutvi4vResult(" ");
			//									multiEngResults.setSuspectResult(" ");
			//									multiEngResults.setUniqueResult(" ");
			//									multiEngResults.setWellknownResult(" ");
			//									reco.setMultiEngineResults(multiEngResults);
			//								}
			//							}
			//
			//						}
			//					}
			//				}
			//
			//			});
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		//return roots;
	}

}
