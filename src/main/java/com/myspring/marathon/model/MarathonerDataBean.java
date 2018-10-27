package com.myspring.marathon.model;

import lombok.Data;

@Data
public class MarathonerDataBean {
	
	private Integer marathonerId;
	
	private UserBean userDetails;
	
	private RaceCategoryBean raceCategoryBean;
	
	private ShirtDetailsBean shirtDetailsBean;
	
	private String bibName;
	
	

}
