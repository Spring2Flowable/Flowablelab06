package com.shareniu.flowable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shareniu.flowable.config.CommonDataSourceConfig;
import com.shareniu.flowable.config.ShareniuDataSourceConfig;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private ShareniuDataSourceConfig shareniuDataSourceConfig;
	@Autowired
	private CommonDataSourceConfig commonDataSourceConfig;
	@RequestMapping(value="getUser")
     public String getUser() {	
		System.out.println(shareniuDataSourceConfig);
		System.out.println(commonDataSourceConfig);
    	 return "success";
     }
	
}
