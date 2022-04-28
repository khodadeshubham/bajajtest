package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Data;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;



@RestController
public class UserController
{
	@Autowired
	UserService uservice;
	
	@PostMapping("/bfhl")
	public User getUser(@RequestBody Data data)
	{
		String []arr= data.getData();
		return uservice.getUser(arr);
	}
	

	

}
