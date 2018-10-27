package com.myspring.marathon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarathonController {

	@RequestMapping("/SelfRegistration")
	public String SelfRegistration() {
		return "Self registration";
	}

	@RequestMapping("/OthersRegistration")
	public String OthersRegistration() {
		return "Other registration";
	}

}
