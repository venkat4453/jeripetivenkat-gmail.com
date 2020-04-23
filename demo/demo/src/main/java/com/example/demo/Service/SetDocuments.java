/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Service;

import com.example.demo.dto.service.BasicInfoService;
import com.example.demo.modal.DocumentsModal;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.serial.SerialBlob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author venkateswara
 */
public class SetDocuments {

    private static final org.slf4j.Logger log
            = org.slf4j.LoggerFactory.getLogger(SetDocuments.class);
    @Autowired
    BasicInfoService repository;

    public void saveDocuments(MultipartFile pan,
            MultipartFile aadhar,
            MultipartFile bankstatement,
            MultipartFile photo, String mobile) {
        try {
            String panName = pan.getOriginalFilename();
            String aadharName = pan.getOriginalFilename();
            String bankName = pan.getOriginalFilename();
            String photoName = pan.getOriginalFilename();
            String path = "/home/venkateswara/project files";
            String panpath = path + panName;
            String aadharpath = path + aadharName;
            String bankpath = path + bankName;
            String photipath = path + photoName;
            File panfile = new File(panpath);
            File aadharfile = new File(aadharpath);
            File bankfile = new File(bankpath);
            File photofile = new File(photipath);
            pan.transferTo(panfile);
            pan.transferTo(aadharfile);
            pan.transferTo(bankfile);
            pan.transferTo(photofile);
        } catch (IOException ex) {
            Logger.getLogger(SetDocuments.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(SetDocuments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
