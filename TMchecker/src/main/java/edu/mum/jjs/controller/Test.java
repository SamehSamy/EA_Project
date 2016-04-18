package edu.mum.jjs.controller;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import edu.mum.jjs.domain.TimeSlot;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String serverURL = "http://localhost:8080/Tmchecker" ;	
    RestTemplate restTemplate = new RestTemplate();
    List<TimeSlot> time = restTemplate.getForObject(serverURL+"/rest/student/timeSlot", List.class);
    System.out.println(time.size());
    
	}

}
