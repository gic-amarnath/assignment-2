package com.jsondemotwo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiEngineResults {
	private String suspectResult;
	private String cbvutvi4vResult;
	private String wellknownResult;
	private String uniqueResult;
	
}
