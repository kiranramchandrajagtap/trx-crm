package com.traxcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.entites.Contact;

public interface Contactrespository extends JpaRepository<Contact, Long> {

}
