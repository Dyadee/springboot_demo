package com.barehacks.durianbite.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
	@RequestMapping(value="/")
	@ResponseBody
	public String helloboot(){
		return "Hello Spring Boot in STS and Github!";
	}

}
