package edu.mum.jjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckerController { 
	    
	@RequestMapping()
	public String dummy(){
		return "EmployeeForm";
	}
}
