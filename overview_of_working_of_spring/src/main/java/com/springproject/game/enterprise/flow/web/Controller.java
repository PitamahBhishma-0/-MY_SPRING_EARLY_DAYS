package com.springproject.game.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.game.enterprise.flow.business.Business;

//SENDING RESPONSE TO THE CLIENT

@RestController
public class Controller {
	@Autowired
    Business business;
    @GetMapping("/sum")
   
    public long displaysum() {
    	return business.sum();
    }
    @GetMapping("/")
    public String run() {
    	return "WELCOME";
    }
}

//BUSINESS LOGIC

//DATA LOGIC

