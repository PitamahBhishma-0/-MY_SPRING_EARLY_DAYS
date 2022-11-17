package com.gaurav.registration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gaurav.registration.model.User;
import com.gaurav.registration.web.dto.UserRegistrationDTO;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDTO registrationDto);
}
