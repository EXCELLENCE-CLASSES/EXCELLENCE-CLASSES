package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class cat implements AnimalInterface {

	@Override
	public void getSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meow");

	}

}
