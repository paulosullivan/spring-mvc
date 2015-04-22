package com.posullivan.springmvc.dto;


public class Employee extends Person {
	
	private Role role;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
