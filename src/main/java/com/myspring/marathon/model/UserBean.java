package com.myspring.marathon.model;

import java.util.Date;

import lombok.Data;

@Data
public class UserBean {
	
	private Integer runnerID;
	
	private String firstName;
	
	private String lastName;
	
	private String displayName;
	
	private String emailId;
	
	private String phoneNumber;
	
	private String gender;
	
	private String bloodGrp;
	
	private String organization;
	
	private Date DOB;
	
	

}
