/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto.service;

import com.example.demo.modal.AddressInfoModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author venkateswara
 */
@Repository
public interface AddressInfoRepositery extends JpaRepository<AddressInfoModal, Long>{
    
}
