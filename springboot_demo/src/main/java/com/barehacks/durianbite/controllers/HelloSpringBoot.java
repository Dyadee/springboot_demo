package com.barehacks.durianbite.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/*
 * @return View "home"
 * */
@Controller
@EnableAutoConfiguration
public class HelloSpringBoot {
	
	private String homeTitle = "My First Spring Boot App";
	private String aboutTitle = "About Us";
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model){
		model.addAttribute("home", homeTitle);
		return "home";
	}
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model){
		model.addAttribute("about", aboutTitle);
		return "about";
	}

}
