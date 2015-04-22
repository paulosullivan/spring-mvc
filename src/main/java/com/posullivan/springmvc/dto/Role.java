package com.posullivan.springmvc.dto;

public enum Role {
	
	MANAGER("Manager"),
	SALES_PERSON("Sales Person");
	
	private String type;
	
	private Role(String type) {
		this.type = type;
	}
	
}
