package com.siddu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("test")
public class HomeController {
	@RequestMapping(value =  "home" , method = RequestMethod.GET)
	public String adminPage(ModelMap model) {
		model.addAttribute("msg", "This home page");
		return "homePage";
	}
	
}
