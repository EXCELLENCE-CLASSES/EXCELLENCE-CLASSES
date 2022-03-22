package io.movieinfo.movieinfoservice;


import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class MovieResource {
	
	
	@RequestMapping("/movie/{id}")
	public  List<Movie> getMovie(@PathVariable("id") String id)
	{
		return Collections.singletonList(new Movie("Titanic",id));
		
		
		
	}
	
	
	
	
	
	

}
