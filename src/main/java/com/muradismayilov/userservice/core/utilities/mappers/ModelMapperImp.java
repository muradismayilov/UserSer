package com.muradismayilov.userservice.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Service
public class ModelMapperImp implements ModelMapperService {

	private ModelMapper modelmapper;
	
	@Override
	public ModelMapper forResponse() {
		this.modelmapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		return this.modelmapper;
	}

	@Override
	public ModelMapper forRequest() {
		this.modelmapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD);
		return this.modelmapper;
	}

/*	public ModelMapperImp() {
		super();
		
	}

	public ModelMapperImp(ModelMapper modelmapper) {
		
		this.modelmapper = modelmapper;
	}

	public ModelMapper getModelmapper() {
		return modelmapper;
	}

	public void setModelmapper(ModelMapper modelmapper) {
		this.modelmapper = modelmapper;
	}*/

	
	
}
