package com.jsondemotwo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Components {
	@JsonProperty("CANDIDATE_DE_COMPLETED_DT")
	private String cANDIDATE_DE_COMPLETED_DT;
	@JsonProperty("PRODUCT")
	private String pRODUCT;
	@JsonProperty("Component name")
	private String componentname;
	@JsonProperty("componentName")
	private String componentName;
	@JsonProperty("dbComponent")
	private String dbComponent;
	@JsonProperty("Records")
	public List<Records> record;
}
