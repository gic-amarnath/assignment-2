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
public class ComponentScoping {

	@JsonProperty("SBU_NAME")
	private String sBU_NAME;
	@JsonProperty("CRNCreationDate")
	private String cRNCreationDate;
	@JsonProperty("Package Name")
	private String packageName;
	@JsonProperty("CASE_NUMBER")
	private String cASE_NUMBER;
	@JsonProperty("CLIENT_NAME")
	private String cLIENT_NAME;
	@JsonProperty("CASE_UUID")
	private String cASE_UUID;
	@JsonProperty("Candidate_Name")
	private String candidate_Name;
	@JsonProperty("CLIENT_CODE")
	private String cLIENT_CODE;
	@JsonProperty("CASE_REF_NUMBER")
	private String cASE_REF_NUMBER;
	@JsonProperty("TYPE")
	private String tYPE;
	@JsonProperty("BaseEJCCountryList")
	private String baseEJCCountryList;

	private CaseReference caseReference;
	private ClientSpecificFields clientSpecificFields;
	@JsonProperty("Components")
	private List<Components> components;
	private CaseMoreInfo caseMoreInfo;
	private CaseDetails caseDetails;
}
