package com.traxcrm.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entites.Contact;
import com.traxcrm.repository.Contactrespository;


@Service
public class ContactserviceImpl implements Contactservice {
	@Autowired
	Contactrespository contactrepo;

	@Override
	public void savecontact(Contact contact) {
	  contactrepo.save(contact);
	}

	@Override
	public List<Contact> listAll() {
		List<Contact> contacts = contactrepo.findAll();
		return contacts;
	}

	@Override
	public Contact findContactById(long id) {
		Optional<Contact>contactBy=contactrepo.findById(id);
		Contact contact=contactBy.get();
		return contact;
	}

}
