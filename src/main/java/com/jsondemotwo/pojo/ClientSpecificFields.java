package com.jsondemotwo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientSpecificFields {

	@JsonProperty("Client POC")
	private String clientPOC;
	@JsonProperty("I verify - Client portal case or offline case")
	private String iverifyClientportalcaseorofflinecase;
	@JsonProperty("HCL case date")
	private String hCLcasedate;
	@JsonProperty("CTS request ID")
	private String cTSrequestID;
	@JsonProperty("Project ID")
	private String projectID;
	@JsonProperty("Employee ID")
	private String employeeID;
	@JsonProperty("CTS Associate ID")
	private String cTSAssociateID;
	@JsonProperty("HiringManagerName")
	private String hiringManagerName;
	@JsonProperty("PO Number")
	private String pONumber;
	@JsonProperty("Account Name")
	private String accountName;
	@JsonProperty("Department")
	private String department;
	@JsonProperty("Requestor Name")
	private String requestorName;
	@JsonProperty("Cost Centre")
	private String costCentre;
	@JsonProperty("Date of joining")
	private String dateofjoining;
	@JsonProperty("Division")
	private String division;
	@JsonProperty("Identity Document")
	private String identityDocument;
	@JsonProperty("Date of Request")
	private String dateofRequest;
	@JsonProperty("BGV ID-Pre/Post/Existing")
	private String bGVIDPrePostExisting;
	@JsonProperty("Candidate Identification Number")
	private String candidateIdentificationNumber;
	@JsonProperty("JRNumber")
	private String jRNumber;
	@JsonProperty("Position")
	private String position;
	@JsonProperty("Candidate ID")
	private String candidateID;
	@JsonProperty("requestoremail")
	private String requestoremail;
	@JsonProperty("Request ID")
	private String requestID;
	@JsonProperty("Tennessee Stopped date")
	private String tennesseeStoppeddate;
	@JsonProperty("Project Name")
	private String projectName;
	@JsonProperty("Hiring Country")
	private String hiringCountry;
	@JsonProperty("SR No")
	private String sRNo;
	@JsonProperty("Date of Re-initiation")
	private String dateofReinitiation;
	@JsonProperty("Initiator Name")
	private String initiatorName;
	
}
