package com.muradismayilov.userservice.business.rules;

import org.springframework.stereotype.Service;

import com.muradismayilov.userservice.core.utilities.exceptions.BusinessException;

import com.muradismayilov.userservice.dataaccess.abstracts.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Service
public class UserBusinessRules {
	
	private UserRepository userrepository;
	
	public void checkIfUserNameExists(String name) {
		
		if(this.userrepository.existsByName(name)) {
			throw new BusinessException("User already exists");
		}
	}

}
