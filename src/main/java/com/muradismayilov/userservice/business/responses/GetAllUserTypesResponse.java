package com.muradismayilov.userservice.business.responses;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUserTypesResponse {
	
	private int id;
	private String gender;
	private int heigth;
	private int weight;
	private int howold;
	private String userName;
	private String userSurName;
}
