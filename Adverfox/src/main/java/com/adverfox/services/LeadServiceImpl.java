package com.adverfox.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.adverfox.entities.Lead;
import com.adverfox.repositories.LeadRepo;

@Service
public class LeadServiceImpl implements LeadService {
	
	
	@Autowired
	private LeadRepo leadrepo;
	
	
	@Override
	public void saveLead(Lead lead) {
		leadrepo.save(lead);
		
	}

}
