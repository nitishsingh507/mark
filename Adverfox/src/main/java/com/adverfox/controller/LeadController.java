package com.adverfox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adverfox.entities.Lead;
import com.adverfox.services.LeadService;



@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	
	@RequestMapping("/createLead")
	public String createNewLead() {
		return "create_new_lead";
	}
	
	@RequestMapping("/savelead")
	public String SaveOneLead(@ModelAttribute ("leads")Lead lead) {
		leadService.saveLead(lead);
		System.out.println(lead.getFirstname());
		System.out.println(lead.getLastname());
		System.out.println(lead.getEmail());
		System.out.println(lead.getMobile());
		return "create_new_lead";
	}
}
