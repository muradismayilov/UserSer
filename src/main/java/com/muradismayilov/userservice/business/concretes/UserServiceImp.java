package com.muradismayilov.userservice.business.concretes;


import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.muradismayilov.userservice.business.abstracts.UserService;
import com.muradismayilov.userservice.business.requests.CreateUserRequest;
import com.muradismayilov.userservice.business.requests.UpdateUserRequest;
import com.muradismayilov.userservice.business.responses.GetAllUsersResponse;
import com.muradismayilov.userservice.business.responses.GetByIdUserResponse;
import com.muradismayilov.userservice.business.rules.UserBusinessRules;
import com.muradismayilov.userservice.core.utilities.mappers.ModelMapperService;
import com.muradismayilov.userservice.dataaccess.abstracts.UserRepository;
import com.muradismayilov.userservice.entity.concretes.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserServiceImp implements UserService {

	private UserRepository userrepository;
	private ModelMapperService modelmapperservice;
	private UserBusinessRules userbusinessrules;
	
	/*public UserServiceImp(ModelMapperService modelmapperservice) {
		this.modelmapperservice=modelmapperservice;
	}
	
	@Autowired
	public UserServiceImp(UserRepository userrepository) {
		this.userrepository=userrepository;
	}*/
	
	@Override
	public List<GetAllUsersResponse> getAll(){
		List<User> users= userrepository.findAll();
		/*List<GetAllUsersResponse> userresponse = new ArrayList<com.muradismayilov.userservice.business.responses.GetAllUsersResponse>();
	
	for(User user: users) {
		  GetAllUsersResponse responseItem = new GetAllUsersResponse();
	      responseItem.setId(user.getId());
	      responseItem.setName(user.getName());
	      userresponse.add(responseItem);
	}*/
	
	List<GetAllUsersResponse> userresponse = users.stream()
			                                         .map(user-> this.modelmapperservice.forResponse()
			                                        		 .map(user, GetAllUsersResponse.class)).collect(Collectors.toList());
	 
			    
			                                         return userresponse;
	}
	
	@Override
	public void add(CreateUserRequest createuserrequest) {
		/*User user = new User();
		/user.setName(createuserrequest.getName());
		/this.userrepository.save(user);*/
		
		this.userbusinessrules.checkIfUserNameExists(createuserrequest.getName());//rules
		
		User user = this.modelmapperservice.forRequest().map(createuserrequest,User.class);
		this.userrepository.save(user);
		
	}

	@Override
	public void update(UpdateUserRequest updateuserrequest) {
		User user = this.modelmapperservice.forRequest().map(updateuserrequest,User.class);
		this.userrepository.save(user);
		
	}

	@Override
	public void delete(int id) {
		this.userrepository.deleteById(id);
		
	}

	@Override
	public GetByIdUserResponse getById(int id) {
		User user = this.userrepository.findById(id).orElseThrow();
		
		GetByIdUserResponse response = this.modelmapperservice.forResponse().map(user, GetByIdUserResponse.class);
		return response;
	}

}
