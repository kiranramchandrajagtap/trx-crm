package com.traxcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.entites.Lead;

public interface Leadreposoitory extends JpaRepository<Lead, Long> {

}
