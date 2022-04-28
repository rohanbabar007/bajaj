package com.example.demo.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.ResponsePOJO;

@RestController
//@RequestMapping("/bfhl")
public class BajajRestAPI {

	@PostMapping("/bfhl")
	public ResponsePOJO insert(@RequestBody String[] data)
    {
		System.out.println(data);
		ResponsePOJO obj = new ResponsePOJO();
		List<String> number = new ArrayList<>();
		List<String> character = new ArrayList<String>(); 
		
		//ResponsePOJO obj = new ResponsePOJO();
		obj.setIs_success(true);
		obj.setUser_id("rohan_28061999");
		obj.setEmail_id("rohan8623@gmail.com");
		obj.setRoll_number("ABCD1234");
		
		for(int i=0; i<data.length; i++)
		{
			if(data[0].charAt(i) >= 'A' &&  data[0].charAt(i) <= 'Z')
			{
				character.add(data[i]);
			}
			else
			{
				number.add(data[i]);
			}
		}
		
		String num[] = new String[number.size()];
		String alpha[] = new String[character.size()];
		int i=0 , j=0;
		for(String numbers : number)
		{
			num[i] =  numbers;
		}
		
		for(String ch : character)
		{
			alpha[j] = ch;
			j++;
		}
		
		obj.setAlphabate(alpha);
		obj.setNumbers(num);
		
		
		
		return obj;
		
	}
}
// "data": ["A","1","343","4","R"]