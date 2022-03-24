package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.ExcellenceClassesModel;
import com.example.demo.model.ExcellenceStudentModel;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner{
	
	
	@Bean
	public ExcellenceClassesModel getExcellenceModel() 
	{
		ExcellenceClassesModel excClassesModel=new ExcellenceClassesModel();
		
		excClassesModel.setExcellenceName("Excellence Online&Offline Classes");
		ExcellenceStudentModel excStuModel=new ExcellenceStudentModel();
		
		excStuModel.setExcellenceStudentName("Er. Ritesh Ranjan Arya");
		List<ExcellenceStudentModel> a1=new ArrayList<>();
		a1.add(excStuModel);
		ExcellenceStudentModel excStuModel2=new ExcellenceStudentModel();
		excStuModel.setExcellenceStudentName("Ritesh Ranjan Arya");
		a1.add(excStuModel2);
		excClassesModel.setExcModel(a1);		
		
		return excClassesModel ;
	}

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	}

}
