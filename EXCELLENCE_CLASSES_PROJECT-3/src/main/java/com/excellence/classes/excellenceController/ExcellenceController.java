package com.excellence.classes.excellenceController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excellence.classes.dao.ExcellenceRepo;
import com.excellence.classes.model.Excellence;

@RestController
public class ExcellenceController {
	
	@Autowired
	ExcellenceRepo repo;
	
	
	@RequestMapping("/exc/{aid}")
	public Optional<Excellence> getExcellences(@PathVariable("aid") int aid)
	{
		
			
				
				return repo.findById(aid);
		
	}
	@DeleteMapping("deletExcellence/{id}")
	public String deleteExcellence(@PathVariable int id) {
		
		Excellence e1=repo.getById(id);
		repo.delete(e1);
		return "deleted";
	}

	@GetMapping("/exce" )	
	public List<Excellence> getExcellence()
	{
		
			
				
				return repo.findAll();
		
	}
	
	@RequestMapping("/")
	public String method1()
	{
		return "Excellence.jsp" ;
	}
	@PutMapping(path="/connect",consumes= {"application/json"})
	public Excellence updateExcellence(@RequestBody Excellence e1) 
	{
		repo.save(e1);
		return e1;
	}
	
	
	
	@PostMapping(path="/connect",consumes= {"application/json"})
	public Excellence addExcellence(@RequestBody Excellence e1) 
	{
		repo.save(e1);
		return e1;
	}
	
	

}
