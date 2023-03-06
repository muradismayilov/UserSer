package com.muradismayilov.userservice.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersResponse {
	
	private int id;
	private String name;
	
	
	/*public GetAllUsersResponse(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public GetAllUsersResponse() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/

	
	
	

}
