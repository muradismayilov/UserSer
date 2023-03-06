package com.muradismayilov.userservice.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.muradismayilov.userservice.business.abstracts.UserTypesService;
import com.muradismayilov.userservice.business.requests.CreateUserTypesRequest;
import com.muradismayilov.userservice.business.responses.GetAllUserTypesResponse;

import com.muradismayilov.userservice.core.utilities.mappers.ModelMapperService;
import com.muradismayilov.userservice.dataaccess.abstracts.UserTypesRepository;

import com.muradismayilov.userservice.entity.concretes.UserTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserTypesServiceImp implements UserTypesService {
	
	private UserTypesRepository usertypesrepository;
	private ModelMapperService modelmapperservice;

	@Override
	public List<GetAllUserTypesResponse> getAll() {
		
		List<UserTypes> usertypes= usertypesrepository.findAll();
		
		List<GetAllUserTypesResponse> userresponse = usertypes.stream().map(usertype -> this.modelmapperservice.forResponse()
				.map(usertypes, GetAllUserTypesResponse.class)).collect(Collectors.toList());		


                return userresponse;
	}

	@Override
	public void add(CreateUserTypesRequest createusertypesrequest) {
		UserTypes usertype = this.modelmapperservice.forRequest().map(createusertypesrequest,UserTypes.class);
		this.usertypesrepository.save(usertype);
		
	}
	
	

}
