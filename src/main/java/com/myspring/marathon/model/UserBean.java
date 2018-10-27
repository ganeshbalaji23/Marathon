package com.myspring.marathon.model;

import java.util.Date;

import lombok.Data;

@Data
public class UserBean {
	
	private Integer userID;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String phoneNumber;
	
	private GenderBean gender;
	
	private BloodGroupBean bloodGrp;
	
	private IDCardDetailsBean idCardDetailsBean;
	
	private String organization;
	
	private Date DOB;
	
	private String emergencyContactName;
	
	private String emergencyContactNo;
	
	private String emergencyRelationship;
	
	private boolean isStudent;
	
	private boolean hasHealthProb;
	
	private String healthDesc;
	
	
	
	private UserBean(){}
	
	

}
