package com.posullivan.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/healthCheck")
public class HealthCheckController {
	
	//@RequestMapping(method = RequestMethod.GET)
	@RequestMapping("/healthCheck")
	public ModelAndView healthCheck() {
		String message = "Spring MVC App is running!!!";
		return new ModelAndView("healthCheck", "message", message);
	}

}
