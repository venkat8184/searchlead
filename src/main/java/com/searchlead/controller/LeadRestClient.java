package com.searchlead.controller;

import org.springframework.web.client.RestTemplate;

import com.searchlead.dto.LeadLead;

public class LeadRestClient {
	//to convert JSON object to java object
public LeadLead findById(long id) {
	RestTemplate rest=new RestTemplate();
	LeadLead lead = rest.getForObject("http://localhost:9876/api/leads/get/"+id, LeadLead.class);
	System.out.println("request came to Client");
	return lead;
}
}
