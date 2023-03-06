package com.muradismayilov.userservice.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateUserRequest {

	
	
	private String name;
	private String surName;
	private String fatherName;
	private String userName;

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UpdateUserRequest(String name) {
		
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UpdateUserRequest(int id, String name) {
		
		this.id = id;
		this.name = name;
	}*/



	
	
	
}
