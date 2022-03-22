package io.excellence.moviecatalogservice;


import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class MovieCatalogResource 
{
	
	
	@RequestMapping("catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		//Get All Related MovieIds
		
		//Get For each movieId call info service and get details
		
		//put them all together 
		
		return Collections.singletonList(new CatalogItem("Titanic","Epic Romance",4));
		
		
		
	}
	
	
	
	
	
	

}
