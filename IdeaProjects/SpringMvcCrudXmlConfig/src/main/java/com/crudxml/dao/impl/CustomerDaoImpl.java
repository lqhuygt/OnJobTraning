package com.crudxml.dao.impl;

import com.crudxml.dao.CustomerDao;
import com.crudxml.model.Customer;
import com.crudxml.model.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAll() {
        String sql = "SELECT * FROM customer";
        return jdbcTemplate.query(sql, new CustomerMapper());
    }

    @Override
    public List<Customer> getById(int id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return jdbcTemplate.query(sql, new CustomerMapper(), id);
    }

    @Override
    public void save(Customer customer) {
        String sql = "INSERT INTO customer (name, address) VALUES (?, ?)";
        jdbcTemplate.update(sql, customer.getName(), customer.getAddress());
    }

    @Override
    public void update(Customer customer) {
        String sql = "UPDATE customer SET name = ?, address = ? WHERE id = ? ";
        jdbcTemplate.update(sql, customer.getName(), customer.getAddress(), customer.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM customer WHERE id = " + id;
        jdbcTemplate.update(sql);
    }
}
