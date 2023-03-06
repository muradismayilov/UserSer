package com.muradismayilov.userservice.business.abstracts;

import java.util.List;

import com.muradismayilov.userservice.business.requests.CreateUserRequest;
import com.muradismayilov.userservice.business.requests.UpdateUserRequest;
import com.muradismayilov.userservice.business.responses.GetAllUsersResponse;
import com.muradismayilov.userservice.business.responses.GetByIdUserResponse;


public interface UserService {
	
	List<GetAllUsersResponse> getAll();
	GetByIdUserResponse getById(int id);
	void add(CreateUserRequest createuserrequest);
	void update(UpdateUserRequest updateuserrequest);
	void delete(int id);

}
