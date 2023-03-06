package com.muradismayilov.userservice.business.requests;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateUserRequest {
	
	@NotNull
	@NotBlank
	private String name;
    @NotNull
	@NotBlank
	private String surName;
	@NotNull
	@NotBlank
	private String fatherName;
	@NotNull
	@NotBlank
	private String userName;

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CreateUserRequest(String name) {
	
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateUserRequest other = (CreateUserRequest) obj;
		return Objects.equals(name, other.name);
	}

	public CreateUserRequest() {
		
	}*/

	
	

	
	

}
