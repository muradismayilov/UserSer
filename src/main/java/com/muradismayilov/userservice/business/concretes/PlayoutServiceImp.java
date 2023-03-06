package com.muradismayilov.userservice.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.muradismayilov.userservice.business.abstracts.PlayoutService;
import com.muradismayilov.userservice.business.requests.CreatePlayoutRequest;
import com.muradismayilov.userservice.business.responses.GetAllPlayoutResponse;

import com.muradismayilov.userservice.core.utilities.mappers.ModelMapperService;
import com.muradismayilov.userservice.dataaccess.abstracts.PlayoutRepository;
import com.muradismayilov.userservice.entity.concretes.Playout;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PlayoutServiceImp implements PlayoutService {
   
	private PlayoutRepository playoutrepository;
	private ModelMapperService modelmapperservice;
	@Override
	public List<GetAllPlayoutResponse> getAll() {
		
  List<Playout> playout= playoutrepository.findAll();
		
		List<GetAllPlayoutResponse> userresponse = playout.stream().map(pl -> this.modelmapperservice.forResponse()
				.map(playout, GetAllPlayoutResponse.class)).collect(Collectors.toList());


                return userresponse;
	}
	@Override
	public void add(CreatePlayoutRequest createplayoutrequest) {
		Playout playout = this.modelmapperservice.forRequest().map(createplayoutrequest,Playout.class);
		this.playoutrepository.save(playout);
		
	}

}
