package com.muradismayilov.userservice.business.responses;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllPlayoutResponse {
	
	private int id;
	private String workPlace;
	private String director;
	private int workYear;

}
