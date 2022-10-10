package com.traxcrm.service;

import java.util.List;

import com.traxcrm.entites.Contact;

public interface Contactservice {
	public void savecontact(Contact contact);

	public List<Contact> listAll();

	public Contact findContactById(long id);

}
