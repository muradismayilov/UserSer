package com.muradismayilov.userservice.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.muradismayilov.userservice.business.abstracts.UserService;
import com.muradismayilov.userservice.business.requests.CreateUserRequest;
import com.muradismayilov.userservice.business.requests.UpdateUserRequest;
import com.muradismayilov.userservice.business.responses.GetAllUsersResponse;
import com.muradismayilov.userservice.business.responses.GetByIdUserResponse;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/users")

public class Controller {

	private UserService userservice;
	

	/*public Controller(UserService userservice) {
		this.userservice = userservice;
	}*/
	
	@GetMapping
	public List<GetAllUsersResponse> getAll(){
		return userservice.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdUserResponse getById(@PathVariable int id){
		return userservice.getById(id);
	}
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody CreateUserRequest createuserrequest) {
		this.userservice.add(createuserrequest);
	}
	
	@DeleteMapping("/{id}")
		public void delete(@PathVariable int id) {
		this.userservice.delete(id);
	}
	
	@PutMapping
	public void update(@RequestBody UpdateUserRequest updateuserrequest) {
		this.userservice.update(updateuserrequest);
	}
}
