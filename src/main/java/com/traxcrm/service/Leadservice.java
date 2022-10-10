package com.traxcrm.service;

import java.util.List;

import com.traxcrm.entites.Lead;

public interface Leadservice {
  public void savelead(Lead lead);
  public Lead getLeadById(long id);
public void deleteOneLead(long id);
public List<Lead> listAll();
}
