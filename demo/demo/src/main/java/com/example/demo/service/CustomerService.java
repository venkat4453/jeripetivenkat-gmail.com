package com.example.demo.service;

import com.example.demo.modal.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author venkateswara
 */
@Repository
public interface CustomerService  extends JpaRepository<Customer, Long> {

}
