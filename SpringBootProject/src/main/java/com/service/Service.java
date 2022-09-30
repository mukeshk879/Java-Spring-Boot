package com.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class Service {
	
	
	public Map<String, String> test(){
		Map<String, String> mp = new HashMap<>();
		mp.put("Test1", "Test1");
		mp.put("Test2", "Test2");
		mp.put("Test3", "Test3");
		
		return mp;
	}

	public static void main(String[] args) {

	}

}
