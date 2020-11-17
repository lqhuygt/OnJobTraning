package com.crudxml.controller;

import com.crudxml.dao.CustomerDao;
import com.crudxml.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CrudController {
    @Autowired
    private CustomerDao customerDao;

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String listCustomer(Model model){
        List<Customer> customerList = customerDao.getAll();
        model.addAttribute("listCustomer", customerList);
        return "home";
    }

    @RequestMapping(value = "/customer-form")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "cusform";
    }

    @RequestMapping(value = "/add-customer", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("cus") Customer customer){
        customerDao.save(customer);
        return "redirect:/customer";
    }

    @RequestMapping(value = "/update-customer/{id}")
    public String getCustomerById(@PathVariable int id, Model model){
        List<Customer> customerList = customerDao.getById(id);
//        loi o day minh truyen vao 1 list ben kia chi lay co 1 object
        model.addAttribute("customer", customerList.get(0));
        return "update";
    }

    @RequestMapping(value = "/update-customer", method = RequestMethod.POST)
    public String updateSave(@ModelAttribute("cus") Customer customer, HttpSession session, BindingResult result){
        customerDao.update(customer);
        return "redirect:/customer";
    }

    @RequestMapping(value = "/delete-customer/{id}")
    public String deleteCustomer(@PathVariable int id, Model model){
        customerDao.delete(id);
        return "redirect:/customer";
    }
}
