package com.jsondemotwo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaseDetails {
	
	@JsonProperty("Type of Check")
	private String typeofCheck;
	@JsonProperty("Package Name")
	private String packageName;
	@JsonProperty("Request Status")
	private String requestStatus;
	@JsonProperty("Contact Date")
	private String contactDate;
	@JsonProperty("Do you have a date when we can contact the current or most recent employer for this Candidate?")
	private String doyouhaveadatewhenwecanCandidate;
	@JsonProperty("Case Origin")
	private String caseOrigin;
	@JsonProperty("Email To")
	private String emailTo;
	@JsonProperty("Candidate's First Name")
	private String candidatesFirstName;
	@JsonProperty("Official Email Address")
	private String OfficialEmailAddress;
	@JsonProperty("Start Date")
	private String startDate;
	@JsonProperty("SRT")
	private String sRT;
	@JsonProperty("Remarks")
	private String remarks;
	@JsonProperty("Client Name(Full Business name)")
	private String clientNameFullBusinessname;
	@JsonProperty("Subject Type")
	private String subjectType;
	@JsonProperty("Is Duplicate Case")
	private String isDuplicateCase;
	@JsonProperty("SBU")
	private String sBU;
	@JsonProperty("LOA Submitted")
	private String lOASubmitted;
	@JsonProperty("Personal Email Address")
	private String personalEmailAddress;
	@JsonProperty("Candidate's Last Name")
	private String candidatesLastName;
	@JsonProperty("Package Type")
	private String packageType;
	@JsonProperty("Subject Details to be Entered By")
	private String subjectDetailstobeEnteredBy;
	@JsonProperty("Email Template")
	private String emailTemplate;
	@JsonProperty("Client Cost Code")
	private String clientCostCode;
	@JsonProperty("Client Reference #")
	private String clientReference;
	@JsonProperty("Candidate's Middle Name")
	private String candidatesMiddleName;
	@JsonProperty("Case Date")
	private String caseDate;
	@JsonProperty("Date of Birth")
	private String dateofBirth;
	@JsonProperty("Do you grant FADV persmission for checks to be undertaken with the current or most recent employer now?")
	private String doyougrantFADVcurrentormostrecentemployernow;
	@JsonProperty("Candidate Auhorization Letter")
	private String candidateAuhorizationLetter;
	
}
