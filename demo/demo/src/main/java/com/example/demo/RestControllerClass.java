package com.example.demo;

import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.modal.Customer;
import com.example.demo.service.CustomerRepositery;
//import com.example.service.CustomerService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import static org.glassfish.jersey.internal.inject.Bindings.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author venkateswara
 */
@Slf4j
@RestController
public class RestControllerClass {

    private static final org.slf4j.Logger log
            = org.slf4j.LoggerFactory.getLogger(RestControllerClass.class);
    @Autowired
    CustomerRepositery repository;

    @GetMapping("/getaAllCustomers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> list = repository.getAllCustomers();

        return new ResponseEntity<List<Customer>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getEmployeeById(@PathVariable("id") Long id)
            throws RecordNotFoundException {
        Customer entity = repository.getCustomerById(id);

        return new ResponseEntity<Customer>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Customer> createOrUpdateEmployee(Customer employee)
            throws RecordNotFoundException {
        Customer updated = repository.createOrUpdateCustomer(employee);
        return new ResponseEntity<Customer>(updated, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteCustomerById(@PathVariable("id") Long id)
            throws RecordNotFoundException {
        repository.deleteCustomerById(id);
        return HttpStatus.FORBIDDEN;
    }
}
