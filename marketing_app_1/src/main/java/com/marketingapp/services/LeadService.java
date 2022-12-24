package com.marketingapp.services;

import java.util.List;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entities.Lead;

public interface LeadService {
		public List<Lead> listAll();
		public void saveLead(Lead lead);
		public void deleteLeadById(long id);
		public Lead findOneLeadById(long id);
			
}


