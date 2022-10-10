package com.traxcrm.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entites.Lead;
import com.traxcrm.repository.Leadreposoitory;
@Service 
public class LeadserviceImpl implements Leadservice {
	@Autowired
	private Leadreposoitory leadrepo;

	@Override
	public void savelead(Lead lead) {
		leadrepo.save(lead);
	}

	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
	   Lead lead= findById.get();
		return lead;
	}
	

	@Override
	public void deleteOneLead(long id) {
		leadrepo.deleteById(id);
		
	}

	@Override
	public List<Lead> listAll() {
		List<Lead> leads= leadrepo.findAll();
		return leads;
	}

}
