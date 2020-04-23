/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto.service;

import com.example.demo.modal.ApplicantBasicInfoModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author venkateswara
 */
@Service
public class BasicInfoService{
    
    @Autowired
    BasicInfoRepository repository;
    
    public ApplicantBasicInfoModal createOrUpdateCustomer(ApplicantBasicInfoModal entity) {
        entity = repository.save(entity);

        return entity;
    }
    
    public int findByMobile(String mobile){
        ApplicantBasicInfoModal abim=repository.findByMobile(mobile);
        return abim.getApplicant_id();
    }
}
