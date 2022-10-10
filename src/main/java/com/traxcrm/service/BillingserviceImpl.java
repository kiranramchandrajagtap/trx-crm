package com.traxcrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entites.Billing;
import com.traxcrm.repository.Billingrepository;
@Service
public class BillingserviceImpl implements Billingservice {
     @Autowired
     private Billingrepository billingrepo;
	@Override
	public void saveBill(Billing bill) {
		billingrepo.save(bill);
	}
	@Override
	public List<Billing> listAll() {
	List<Billing>bill=	billingrepo.findAll();
	
		return bill;
	}

}
