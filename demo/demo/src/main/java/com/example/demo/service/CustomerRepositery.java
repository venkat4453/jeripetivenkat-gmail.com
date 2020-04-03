/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.modal.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author venkateswara
 */
@Service
public class CustomerRepositery {

    @Autowired
    CustomerService repository;

    public List<Customer> getAllCustomers() {
        List<Customer> employeeList = repository.findAll();

        if (employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<Customer>();
        }
    }
    public Customer getCustomerById(long id) throws RecordNotFoundException {
         Optional<Customer> customer = repository.findById(id);
         
        if(customer.isPresent()) {
            return customer.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
    
         
    public Customer createOrUpdateCustomer(Customer entity) throws RecordNotFoundException
    {
        Optional<Customer> customer = repository.findById(entity.getId());
         
        if(customer.isPresent())
        {
            Customer newEntity = customer.get();
            newEntity.setEmail(entity.getEmail());
            newEntity.setName(entity.getName());
            newEntity.setAddress(entity.getAddress());
 
            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    }
     
    public void deleteCustomerById(Long id) throws RecordNotFoundException
    {
        Optional<Customer> customer = repository.findById(id);
         
        if(customer.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
}
