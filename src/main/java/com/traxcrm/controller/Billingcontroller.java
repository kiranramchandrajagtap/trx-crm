package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entites.Billing;
import com.traxcrm.entites.Contact;
import com.traxcrm.service.Billingservice;
import com.traxcrm.service.Contactservice;

@Controller
public class Billingcontroller {
	
	
	@Autowired
	private Contactservice contactservice;
	
	@Autowired
	private Billingservice billingservice;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id")long id,ModelMap model) {
		
	Contact contact=contactservice.findContactById(id);
		model.addAttribute("contact",contact);
		
		return"create_bill";
	}
	@RequestMapping("/savebill")
	 public String saveBill(@ModelAttribute("bill") Billing bill,ModelMap model) {
		billingservice.saveBill(bill);
		model.addAttribute("bill",bill);
		return"bill_info";
	}
	@RequestMapping("/listbill")
	public String getAllbill(@RequestParam("id")long id,ModelMap model) {
		List<Billing>bill=billingservice.listAll();
		model.addAttribute("bill",bill);
		return"bill_search_reuslt";
		
	}
	
	}
