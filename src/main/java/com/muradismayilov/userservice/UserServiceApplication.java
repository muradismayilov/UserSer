package com.muradismayilov.userservice;



import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.muradismayilov.userservice.core.utilities.exceptions.BusinessException;
import com.muradismayilov.userservice.core.utilities.exceptions.ProblemDetails;


@SpringBootApplication
@RestControllerAdvice
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)// Xeta vaxti endusera istediyimiz mesaji gostermek
	public ProblemDetails handleBusinessException(BusinessException businessexception) {
		ProblemDetails problemDetails = new ProblemDetails();
		problemDetails.setMessage(businessexception.getMessage());
		return problemDetails;
	}

	
	/*@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)// Xeta vaxti endusera istediyimiz mesaji gostermek
	public ProblemDetails handleValidationException(MethodArgumentNotValidException methodArgumentNotValidException) {
		ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
		validationProblemDetails.setMessage("VALIDATION.EXCEPTION");
		validationProblemDetails.setValidationErrors(new HashMap<String,String>());
		
		for(FieldError fieldError : methodArgumentNotValidException.getBindingResult().getFieldError()) {
			validationProblemDetails.getValidationErrors().put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		return validationProblemDetails;
	}*/
	
	
  @Bean
    public ModelMapper getmodelMapper() {
        return new ModelMapper();
    }
  
  @Configuration
  public class DataSourceConfig {
      @Bean
      public DataSource getDataSource() {
          return DataSourceBuilder.create()
            
            .url("jdbc:postgresql://localhost:5432/Users")
            .username("postgres")
            .password("root")
            .build();	
      }
  }

}
