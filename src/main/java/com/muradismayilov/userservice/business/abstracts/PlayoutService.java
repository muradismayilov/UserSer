package com.muradismayilov.userservice.business.abstracts;

import java.util.List;

import com.muradismayilov.userservice.business.requests.CreatePlayoutRequest;
import com.muradismayilov.userservice.business.responses.GetAllPlayoutResponse;


public interface PlayoutService {
	
	List<GetAllPlayoutResponse> getAll();
	//GetByIdUserTypeResponse getById(int id);
	void add(CreatePlayoutRequest createplayoutrequest);
		//void update(UpdateUserRequest updateuserrequest);
		//void delete(int id);

}
