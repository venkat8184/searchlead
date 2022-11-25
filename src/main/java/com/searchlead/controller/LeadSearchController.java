package com.searchlead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.searchlead.dto.LeadLead;

@Controller
public class LeadSearchController {
   @RequestMapping("/search")
	public String searchLead() {
		return "search_lead";
	}
   @RequestMapping("/searchLead")
   public String searchLead1(@PathVariable("id")long id) {
	   LeadRestClient client=new LeadRestClient();
	   LeadLead lead = client.findById(id);
	   System.out.println(lead.getId());
	   System.out.println(lead.getFirstName());
	   System.out.println(lead.getLastName());
	   System.out.println(lead.getEmail());
	   System.out.println(lead.getMobile());
	   return "show_lead";
   }
}
