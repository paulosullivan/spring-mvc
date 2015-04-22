package com.posullivan.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.posullivan.springmvc.dto.Vehicle;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String get(ModelMap model) {
		model.addAttribute("vehicle", new Vehicle());
		return "vehicleForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String post(@Valid Vehicle vehicle, BindingResult result) {
		if (result.hasErrors()) {
			return "vehicleForm";
		} else {
			return "vehicleConfirmation";
		}
	}

}
