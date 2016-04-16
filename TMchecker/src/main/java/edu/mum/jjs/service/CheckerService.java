package edu.mum.jjs.service;

import java.util.List;

import edu.mum.jjs.domain.Checker;

 public interface CheckerService   {
	
		public List<Checker> getAll();
		
		public List<Checker> getAllProducts();
		
	public Checker save(Checker checker);
	
	public Checker find(Long id);

		   
}
 
