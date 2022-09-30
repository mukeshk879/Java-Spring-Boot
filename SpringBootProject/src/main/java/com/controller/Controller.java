package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Service;


@RestController
public class Controller {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	Service service;
	
	
//	APIs ---------------------------------------
	
	@PostMapping("springBoot/test")
	public Map<String, String> test(){
		
		return service.test();
	}

}
