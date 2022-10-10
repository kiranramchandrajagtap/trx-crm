package com.traxcrm.service;

import java.util.List;

import com.traxcrm.entites.Billing;

public interface Billingservice {
    public void saveBill(Billing bill);

	public List<Billing> listAll();

	
}
