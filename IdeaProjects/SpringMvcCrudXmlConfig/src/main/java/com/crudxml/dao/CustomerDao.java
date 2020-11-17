package com.crudxml.dao;

import com.crudxml.model.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getAll();
    public List<Customer> getById(int id);
    public void save(Customer customer);
    public void update(Customer customer);
    public void delete(int id);
}
