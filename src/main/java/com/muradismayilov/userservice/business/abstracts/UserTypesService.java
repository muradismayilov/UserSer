package com.muradismayilov.userservice.business.abstracts;

import java.util.List;

import com.muradismayilov.userservice.business.requests.CreateUserTypesRequest;
import com.muradismayilov.userservice.business.responses.GetAllUserTypesResponse;



public interface UserTypesService {

	List<GetAllUserTypesResponse> getAll();
	//GetByIdUserTypeResponse getById(int id);
	void add(CreateUserTypesRequest createusertypesrequest);
	//void update(UpdateUserRequest updateuserrequest);
	//void delete(int id);
	
}
