package com.example.demo;



import org.springframework.stereotype.Service;


@Service
public class DogImplementsAnimal implements AnimalInterface {

	@Override
	public void getSound() {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Bho Bho");
		
	}

}
