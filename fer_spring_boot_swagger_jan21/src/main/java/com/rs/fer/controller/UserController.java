package com.rs.fer.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.fer.user.request.RegistrationRequest;
import com.rs.fer.user.response.RegistrationResponse;
import com.rs.fer.user.service.UserService;
import com.rs.fer.user.validation.UserValidation;

@RestController
@RequestMapping("/api")
public class UserController {


	@Autowired
	UserValidation userValidation;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/registration")
	public RegistrationResponse registration(@RequestBody RegistrationRequest request) {
		
		RegistrationResponse response = null;
		
		Set<String> errorMessages = userValidation.validateRegistrationRequest(request);
		
		if(!CollectionUtils.isEmpty(errorMessages)) {
			//return response with error messages
			response = new RegistrationResponse(HttpStatus.PRECONDITION_FAILED, 
					"999", null, errorMessages);
			
		} else {
			response = userService.registration(request);
		}
		
		return response;
		
	}


}