package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.entity.User;




@Service
public class UserService
{
	
	public User getUser(String [] data)
	{
		String status= "";
		String user_id="";
		String email="";
		String roll_number="";
		List<String> numbers= new ArrayList<String>();
		List<String> alphabets= new ArrayList<String>();
		if(data != null && data.length != 0)
		{
			status="true";	
			user_id="shubham_khodade_29121996";
			email="shubham.khodade14@gmail.com";
			roll_number= "210943020090";
			for(int i=0; i< data.length; i++)
			{
				if(Character.isDigit(i))
				{
					numbers.add(data[i]);
				}
				else if(Character.isAlphabetic(i))
				{
					alphabets.add(data[i]);
				}
			}
			User u= new User(status, user_id, email, roll_number, numbers, alphabets);
			return u;
		}
		else
		{
			status="false";
			User u= new User(status);
			return u;
		}

	}

}
