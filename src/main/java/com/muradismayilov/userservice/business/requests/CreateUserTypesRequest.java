package com.muradismayilov.userservice.business.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserTypesRequest {

	@NotNull
	@NotBlank
	private String gender;
	@NotNull
	@NotBlank
	private int userid;
	
	
}
