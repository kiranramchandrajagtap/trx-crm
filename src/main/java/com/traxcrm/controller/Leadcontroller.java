
package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entites.Contact;
import com.traxcrm.entites.Lead;
import com.traxcrm.service.Contactservice;
import com.traxcrm.service.Leadservice;

@Controller
public class Leadcontroller {
	@Autowired
	private Leadservice leadservice;
	
	@Autowired
	private Contactservice contactservice;
	
	@RequestMapping("/")
	public String viewLeadPage() {
		return "view_lead_page";
	
		
	}
	@RequestMapping("/savelead")
   public String saveoneLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
	   leadservice.savelead(lead);
	   model.addAttribute("lead",lead);
	   return"lead_info";
   }
	@RequestMapping("/convertlead")
	public String convertLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead=leadservice.getLeadById(id);
		Contact contact =new Contact();
		contact.setFirstname(lead.getFirstname());
		contact.setLastname(lead.getLastname());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setLeadsource(lead.getLeadsource());
		contact.setGender(lead.getGender());
	
		contactservice.savecontact(contact);
		
		leadservice.deleteOneLead(id);
		 
	List<Contact>contacts=contactservice.listAll();
	model.addAttribute("contacts",contacts);
		
		return"contact_search_reuslt";
}
	@RequestMapping("/listall")
	public String getAllLeads(ModelMap model) {
	List<Lead>leads=leadservice.listAll();
	model.addAttribute("leads", leads);
	
	return"lead_search_reuslt";
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id")long id,ModelMap model ) {
		Lead lead=leadservice.getLeadById(id);
		model.addAttribute("lead",lead);
		return"lead_info";
		
	}
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id")long id,ModelMap model) {
		Contact contact=contactservice.findContactById(id);
		model.addAttribute("contact",contact);
		return"contact_info";
	}
}