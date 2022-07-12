package com.jsondemotwo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"Candidate name","Personal Mobile No","Identification Submitted","First Name","Middle Name",
	"Gender","Doc Identification No","Marital Status","Nationality","documentSource","Home phone","DOB",
	"Is the document clear?","Professional Email ID","Personal Email ID","INSTRUCTION_CHECK_ID",
	"ruleResult","Father’s Name","Last Name"})
public class Records {
	@JsonProperty("Candidate name")
	private String candidatename;
	@JsonProperty("Personal Mobile No")
	private String personalMobileNo;
	@JsonProperty("Identification Submitted")
	private String identificationSubmitted;
	@JsonProperty("First Name")
	private String firstName;
	@JsonProperty("Middle Name")
	private String middleName;
	@JsonProperty("Gender")
	private String gender;
	@JsonProperty("Doc Identification No")
	private String docIdentificationNo;
	@JsonProperty("Marital Status")
	private String maritalStatus;
	@JsonProperty("Nationality")
	private String nationality;
	
	private List<DocumentSource> documentSource;
	
	@JsonProperty("Home phone")
	private String homephone;
	@JsonProperty("DOB")
	private String dOB;
	@JsonProperty("Is the document clear?")
	private String isthedocumentclear;
	@JsonProperty("Professional Email ID")
	private String professionalEmailID;
	@JsonProperty("Personal Email ID")
	private String personalEmailID;
	@JsonProperty("INSTRUCTION_CHECK_ID")
	private String iNSTRUCTION_CHECK_ID;
	private RuleResult ruleResult;
	@JsonProperty("Father’s Name")
	private String fathersName;
	
	
	@JsonProperty("Last Name")
	private String lastName;
	@JsonProperty("Aka Name")
	private String akaName;
	@JsonProperty("Completed/Pursuing")
	private String completedPursuing;
	@JsonProperty("University Location (State)")
	private String universityLocationState;
	@JsonProperty("Period of Study (To)")
	private String periodofStudyTo;
	@JsonProperty("University City")
	private String universityCity;
	@JsonProperty("University(Country)")
	private String universityCountry;
	@JsonProperty("College Name")
	private String collegeName;
	@JsonProperty("Unique Number")
	private String uniqueNumber;
	@JsonProperty("Result")
	private String result;
	@JsonProperty("Year of Passing")
	private String yearofPassing;
	@JsonProperty("Specialization")
	private String specialization;
//	@JsonProperty("Is the document clear?")
//	private String isthedocumentclear;
	@JsonProperty("Regular or Correspondence")
	private String regularorCorrespondence;
	@JsonProperty("University Name")
	private String universityName;
	@JsonProperty("College/Centre Name Aka Name")
	private String collegeCentreNameAkaName;
	@JsonProperty("Part time or full time")
	private String parttimeorfulltime;
	@JsonProperty("College(Country)")
	private String collegeCountry;
	@JsonProperty("College City")
	private String collegeCity;
	@JsonProperty("Qualification/course name")
	private String qualificationcoursename;
	@JsonProperty("Period of Study (From)")
	private String periodofStudyFrom;
	@JsonProperty("Qualification level")
	private String qualificationlevel;
	
	@JsonProperty("Grade/Class")
	private String gradeClass;
	@JsonProperty("University Aka Name")
	private String universityAkaName;
	@JsonProperty("Document issued Date")
	private String documentissuedDate;
	@JsonProperty("Is this Professional Education")
	private String isthisProfessionalEducation;
	@JsonProperty("College Location (State)")
	private String collegeLocationState;
	
	@JsonProperty("Month of Passing")
	private String monthofPassing;
	
	@JsonProperty("Unique Number Type")
	private String uniqueNumberType;
	
	
	@JsonProperty("Entity Specific Type")
	private String entitySpecificType;
	@JsonProperty("Supervisor's Email ID")
	private String supervisorsEmailID;
	@JsonProperty("Company Aka Name")
	private String companyAkaName;
	@JsonProperty("Employee ID")
	private String employeeID;
	@JsonProperty("Third Party or Agency Name and Address")
	private String thirdPartyorAgencyNameandAddress;
	@JsonProperty("Department")
	private String department;
	@JsonProperty("Date to be contacted")
	private String datetobecontacted;
	@JsonProperty("Third Party Company")
	private String thirdPartyCompany;
	@JsonProperty("Third party Company(city)")
	private String thirdpartyCompanycity;
	@JsonProperty("HR Name")
	private String hRName;
	@JsonProperty("Employment Type")
	private String employmentType;
	@JsonProperty("Date Of Exit (Till Date)")
	private String dateOfExitTillDate;
	@JsonProperty("Date of joining")
	private String dateofjoining;
	@JsonProperty("Entity Specific ID")
	private String entitySpecificID;
	@JsonProperty("Reason for Leaving")
	private String reasonforLeaving;
	@JsonProperty("Supervisor Name")
	private String supervisorName;
	@JsonProperty("Supervisor's Contact No")
	private String supervisorsContactNo;
	@JsonProperty("Company Contact No")
	private String companyContactNo;
	@JsonProperty("Date of Exit")
	private String dateofExit;
	@JsonProperty("Supervisor Designation")
	private String supervisorDesignation;
	@JsonProperty("Self employment/Family business")
	private String selfemploymentFamilybusiness;
	@JsonProperty("Designation")
	private String designation;
	@JsonProperty("Reason For Gap")
	private String reasonForGap;
	@JsonProperty("Can CE be contacted")
	private String canCEbecontacted;
	@JsonProperty("HR Contact No")
	private String hRContactNo;
	@JsonProperty("Is this Previous Employment linked to Current Employment")
	private String isthisPreviousEmploymentlinkedtoCurrentEmployment;
	@JsonProperty("City")
	private String city;
	@JsonProperty("Remuneration")
	private String remuneration;
	@JsonProperty("Is this your Current Employment (CE)")
	private String isthisyourCurrentEmploymentCE;
	@JsonProperty("Location Where the Candidate was deployed/Location Where the Candidate Worked")
	private String locationWhereCandidateWorked;
	
	@JsonProperty("Third party Company(Country)")
	private String thirdpartyCompanyCountry;
	@JsonProperty("Company Name")
	private String companyName;
	@JsonProperty("HR email ID")
	private String hRemailID;
	@JsonProperty("State")
	private String state;
	@JsonProperty("Complete Company Address with Landmark")
	private String completeCompanyAddresswithLandmark;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Third party Company(state)")
	private String thirdpartyCompanystate;
	
	@JsonProperty("Nature of Employment")
	private String natureofEmployment;
	@JsonProperty("Service Type")
	private String serviceType;
	
	private MultiEngineResults multiEngineResults;
}
