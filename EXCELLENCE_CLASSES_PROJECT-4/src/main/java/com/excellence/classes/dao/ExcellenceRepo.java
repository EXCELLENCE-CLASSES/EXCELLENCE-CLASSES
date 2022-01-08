package com.excellence.classes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.excellence.classes.model.Excellence;

@RepositoryRestResource(collectionResourceRel ="excellence", path="excellence")
public interface ExcellenceRepo extends JpaRepository<Excellence,Integer >
{
	

}
