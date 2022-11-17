package com.gaurav.registration.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gaurav.registration.service.UserService;
import com.gaurav.registration.web.dto.UserRegistrationDTO;

@Controller
@RequestMapping("/registration")
public class UserController {
    private UserService userService;
    
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@ModelAttribute("user")
	public UserRegistrationDTO userDto() {
		return new UserRegistrationDTO();
	}
    @GetMapping
    public String showRegistration() {
    	return "registration";
    }
    @PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO dto) {
    	userService.save(dto);
		return "redirect:/registration?success";
	}
}
