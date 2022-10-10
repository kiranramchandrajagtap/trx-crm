package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.traxcrm.entites.Contact;
import com.traxcrm.service.Contactservice;


@Controller
public class ContactController {
	
	@Autowired
	private Contactservice contactservice;
	
	@RequestMapping("/listcontacts")
	public String listAllContacts(ModelMap model) {
	List<Contact>contacts=contactservice.listAll();
	model.addAttribute("contacts",contacts);
	return"contact_search_reuslt";
	}


}
