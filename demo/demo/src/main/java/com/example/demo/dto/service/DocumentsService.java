/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto.service;

import com.example.demo.modal.DocumentsModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author venkateswara
 */
@Service
public class DocumentsService {
    @Autowired
    DocumentsRepository service;
    
    public DocumentsModal saveDocuments(DocumentsModal entity){
        service.save(entity);
        return entity;
    }
}
