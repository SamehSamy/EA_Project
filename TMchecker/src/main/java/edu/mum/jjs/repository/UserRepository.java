package edu.mum.jjs.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.jjs.domain.Checker;

	@Repository
	public interface UserRepository extends  CrudRepository<Checker, Long> 
	{
	
 	    // findAll comes with repository
//	    @Query("SELECT p FROM Product p")
//		public List<Product> getAll();
 	
		// if using this INSTEAD of findAll does NOT select Phone...
//	    @Query(value = "select distinct p from Product p left join fetch p.hotLine")
//	    List<Checker> getAllProducts();

	    
	    //		List<Product> getProductsByCategory(String category);

 
	}

