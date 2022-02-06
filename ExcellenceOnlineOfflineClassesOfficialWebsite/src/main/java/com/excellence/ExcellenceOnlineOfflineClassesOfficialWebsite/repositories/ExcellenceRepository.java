package com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.QueryByExampleExecutor;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

import com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.models.ExcellenceClasses;

//public interface Repository<T, ID> {}

//public interface CrudRepository<T, ID> extends Repository<T, ID> 

//public interface PagingAndSortingRepository<T, ID> extends CrudRepository<T, ID> 
//public interface JpaRepository<T, ID> extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> 
public interface ExcellenceRepository extends JpaRepository<ExcellenceClasses, Integer> 
{
	
	
	
	

}
