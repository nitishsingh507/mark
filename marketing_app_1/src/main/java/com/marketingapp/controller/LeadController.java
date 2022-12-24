package com.marketingapp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;
import com.marketingapp.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private EmailService emailService;
	
	
	@Autowired
	private LeadService leadService;
	
	
	
	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		return "create_new_lead";
	}
	
	
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@ModelAttribute("lead") Lead lead) {
//		leadService.saveLead(lead);
//		return "create_new_lead";
//	}
	
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@RequestParam ("firstName") String fName,@RequestParam ("lastName") String lName,@RequestParam("email") String emailId,@RequestParam ("mobile") long mobile) {
//		Lead l = new Lead();
//		l.setFirstName(fName);
//		l.setLastName(lName);
//		l.setEmail(emailId);
//		l.setMobile(mobile);
//		System.out.println(l);
//		leadService.saveLead(l);
//		return "create_new_lead";
//	}
	
//	@RequestMapping("/saveLead")
//	public String saveOneLead( LeadData lead) {
//		Lead l = new Lead();
//		l.setFirstName(lead.getFirstName());;
//		l.setLastName(lead.getLastName());
//		l.setEmail(lead.getEmail());
//		l.setMobile(lead.getMobile());
//		leadService.saveLead(l);
//		return "create_new_lead";
//	}
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute ("lead") Lead lead,ModelMap model ){
		leadService.saveLead(lead);
		emailService.sendSimpleEmail(lead.getEmail(), "wel", "welcome in our application");
		return "create_new_lead";
	}
	
	
	@RequestMapping("/listLeads")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads" , leads); 
 		return "all_leads";
	}
	
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam ("id") long id,ModelMap model) {
		Lead lead = leadService.findOneLeadById(id);
		if(lead!=null) {
		model.addAttribute("lead",lead);
			return "update_lead";
		}else {
			model.addAttribute("error","no record found");
			return "error";
	
		}
	}
	
	@RequestMapping("/updateLead")
	public String updateLead( LeadData data,ModelMap model) {
		Lead l = new Lead();
		l.setId(data.getId());
		l.setFirstName(data.getFirstName());
		l.setLastName(data.getLastName());
		l.setEmail(data.getEmail());
		l.setMobile(data.getMobile());
		
		leadService.saveLead(l);
		
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads",leads);
		return "all_leads";
	}
	
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id ,ModelMap model) {
		leadService.deleteLeadById(id);
		
		List<Lead> leads = leadService.listAll();
		model.addAttribute("leads",leads);
		return "all_leads";
		
		
	}
	
	
	
}
