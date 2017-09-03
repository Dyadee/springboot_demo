package com.barehacks.durianbite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
	private String adminTitle = "Administrator";
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String admin(Model model){
		model.addAttribute("admin", adminTitle);
		return "admin";
	}
}
