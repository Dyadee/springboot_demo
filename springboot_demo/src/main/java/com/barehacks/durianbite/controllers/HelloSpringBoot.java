package com.barehacks.durianbite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class HelloSpringBoot {
//	@RequestMapping("/")
//	public String home(Model model){
//		return "home";
//	}
//
//}

@Controller
public class HelloSpringBoot {
	@RequestMapping("/")
	public String home(Model model){
		return "home";
	}

}
//@Controller
//public class HelloSpringBoot {
//
//   @RequestMapping("/")
//   public String handler (Model model) {
//       model.addAttribute("msg",
//                          "a jar packaging example");
//       return "myView";
//   }
//}