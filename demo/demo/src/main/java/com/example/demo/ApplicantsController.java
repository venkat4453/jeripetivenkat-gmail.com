/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.Service.ApplicantsService;
import com.example.demo.Service.SetDocuments;
import com.example.demo.dto.service.AddressInfoservice;
import com.example.demo.dto.service.BankDetailsService;
import com.example.demo.dto.service.BasicInfoService;
import com.example.demo.dto.service.DocumentsService;
import com.example.demo.dto.service.EmploymentDetailsService;
import com.example.demo.dto.service.PersonalInfoService;
import com.example.demo.modal.AddressInfoModal;
import com.example.demo.modal.ApplicantBasicInfoModal;
import com.example.demo.modal.BnakDetailsModal;
import com.example.demo.modal.EmploymentDetailsModal;
import com.example.demo.modal.PersonalINfoModal;

import com.example.demo.modal.DocumentsModal;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.serial.SerialBlob;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author venkateswara
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ApplicantsController {

    private static final org.slf4j.Logger log
            = org.slf4j.LoggerFactory.getLogger(ApplicantsController.class);

    @Autowired
    BasicInfoService repository;
    @Autowired
    BankDetailsService bankdetailsrepository;
    @Autowired
    PersonalInfoService personalinforepository;
    @Autowired
    EmploymentDetailsService employmentdetailsrepository;

    @Autowired
    AddressInfoservice addressrepo;
    @Autowired
    DocumentsService docsrepo;

    @Autowired
    ApplicantsService applicantService;

    @PostMapping("/applicants/basicinfo")
    public ResponseEntity<ApplicantBasicInfoModal> registerApplicantBasicInfo(@RequestBody ApplicantBasicInfoModal applicantinfo) {
        log.info(applicantinfo.toString());
//        System.out.println(":::::::::::>>>>>>>>>>>>>>"+applicantinfo.toString());
//        repository.createOrUpdateCustomer(applicantinfo);
        return new ResponseEntity<ApplicantBasicInfoModal>(applicantinfo, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/applicants/basicinfo1")
    public ResponseEntity<ApplicantBasicInfoModal> registerApplicantBasicInfo1(@RequestBody Object request) {
        log.info(request.toString());
        System.out.println(":::::::::::>>>>>>>>>>>>>>" + request.toString());
//        ApplicantsService saveApplicantsData = new ApplicantsService();
//        applicantService.saveApplicantBasicInfo(applicantinfo);
        return new ResponseEntity<ApplicantBasicInfoModal>((ApplicantBasicInfoModal) request, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/applicants/personalinfo")
    public ResponseEntity<PersonalINfoModal> registerPersonalINfo(@RequestBody PersonalINfoModal personalinfo //@RequestParam(value = "mobile") String mobile
            ) {
        log.info(personalinfo.toString());
        String mobile = personalinfo.getMobile();
        log.info("mobile number :::::" + mobile);
        int applicantid = repository.findByMobile(mobile);
        log.info("application id is ::::: " + applicantid);
        personalinfo.setApplicantid(applicantid);
        log.info(personalinfo.toString());
        personalinforepository.createOrUpdateCustomer(personalinfo);
        return new ResponseEntity<PersonalINfoModal>(personalinfo, new HttpHeaders(), HttpStatus.OK);

    }

    @PostMapping("/applicants/employmentlinfo")
    public ResponseEntity<EmploymentDetailsModal> registerEmploymentDetails(EmploymentDetailsModal employmentinfo, @RequestParam(value = "mobile") String mobile) {
        log.info(employmentinfo.toString());
        log.info("mobile number :::::" + mobile);
        int applicantid = repository.findByMobile(mobile);
        log.info("application id is ::::: " + applicantid);
        employmentinfo.setApplicantid(applicantid);

//            System.out.println(applicantinfo.getPersonalinfo().toString());
        employmentdetailsrepository.createOrUpdateCustomer(employmentinfo);
        return new ResponseEntity<EmploymentDetailsModal>(employmentinfo, new HttpHeaders(), HttpStatus.OK);

    }

    @PostMapping("/applicants/bankdetails")
    public ResponseEntity<BnakDetailsModal> registerEmploymentDetails(@RequestBody BnakDetailsModal bankdetails) {
        log.info(bankdetails.toString());
        String mobile=bankdetails.getMobile();
        log.info("mobile number :::::" + mobile);
        int applicantid = repository.findByMobile(mobile);
        log.info("application id is ::::: " + applicantid);
        bankdetails.setApplicantId(applicantid);

//            System.out.println(applicantinfo.getPersonalinfo().toString());
        bankdetailsrepository.createOrUpdateCustomer(bankdetails);
        return new ResponseEntity<BnakDetailsModal>(bankdetails, new HttpHeaders(), HttpStatus.OK);

    }

    @PostMapping("/applicants/address")
    public ResponseEntity<AddressInfoModal> registerAddress(@RequestBody AddressInfoModal address) {
        log.info(address.toString());
        String mobile=address.getMobile();
        log.info("mobile number :::::" + mobile);
        int applicantid = repository.findByMobile(mobile);
        log.info("application id is ::::: " + applicantid);
        address.setApplicantsid(applicantid);
        System.out.println(address.toString());
//            System.out.println(applicantinfo.getPersonalinfo().toString());
        addressrepo.createOrUpdateCustomer(address);
        return new ResponseEntity<AddressInfoModal>(address, new HttpHeaders(), HttpStatus.OK);

    }

    @PostMapping("/applicants/documents")
    public ResponseEntity<String> uploadDocuments(@RequestParam("pan") MultipartFile pan,
            @RequestParam("aadhar") MultipartFile aadhar,
            @RequestParam("bankstatement") MultipartFile bankstatement,
            @RequestParam("photo") MultipartFile photo,
            @RequestParam(value = "mobile") String mobile) {
//
//        DocumentsModal docs = new DocumentsModal();
//        try {
//            byte[] pan_array = pan.getBytes();
//            byte[] aadhar_array = aadhar.getBytes();
//            byte[] bankstatement_array = bankstatement.getBytes();
//            byte[] photo_array = photo.getBytes();
//
//            
//            File file=(File) aadhar;
//            String path="/home/venkateswara" ;
//            SerialBlob pan_blob = new javax.sql.rowset.serial.SerialBlob(pan_array);
//            docs.setPancard(pan_blob);
//            SerialBlob aadhar_blob = new javax.sql.rowset.serial.SerialBlob(aadhar_array);
//            docs.setPancard(pan_blob);
//            SerialBlob bankstatement_blob = new javax.sql.rowset.serial.SerialBlob(bankstatement_array);
//            docs.setPancard(pan_blob);
//            SerialBlob photo_blob = new javax.sql.rowset.serial.SerialBlob(photo_array);
//
//            docs.setPancard(pan_blob);
//            docs.setAadhar(aadhar_blob);
//            docs.setBankstatement(bankstatement_blob);
//            docs.setPhoto(photo_blob);
//            SetDocuments setdocs = new SetDocuments();
//            DocumentsModal docspojo = setdocs.saveDocuments(pan, aadhar, bankstatement, photo, mobile);
//            log.info("mobile number :::::" + mobile);
//            int applicantid = repository.findByMobile(mobile);
//            log.info("application id is ::::: " + applicantid);
//            docspojo.setApplicants_id(applicantid);
//            docsrepo.saveDocuments(docs);
//            return new ResponseEntity<String>("success", new HttpHeaders(), HttpStatus.OK);

//        } catch (SQLException | IOException ex) {
//            Logger.getLogger(ApplicantsController.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
        try {
            int applicantid = repository.findByMobile(mobile);
            String panName = applicantid + "_" + pan.getOriginalFilename();
            String aadharName = applicantid + "_" + aadhar.getOriginalFilename();
            String bankName = applicantid + "_" + bankstatement.getOriginalFilename();
            String photoName = applicantid + "_" + photo.getOriginalFilename();
            String path = "/home/venkateswara/project files/";
            String panpath = path + panName;
            String aadharpath = path + aadharName;
            String bankpath = path + bankName;
            String photipath = path + photoName;

            byte[] panbytes = pan.getBytes();
            byte[] aadharbytes = aadhar.getBytes();
            byte[] bankbytes = bankstatement.getBytes();
            byte[] photobytes = photo.getBytes();

            Path panfilepath = Paths.get(panpath);
            Path aadharfilepath = Paths.get(aadharpath);
            Path bankfilepath = Paths.get(bankpath);
            Path photofilepath = Paths.get(photipath);

            log.info(panfilepath.toString());
            log.info(aadharfilepath.toString());
            log.info(bankfilepath.toString());
            log.info(photofilepath.toString());

            Files.write(panfilepath, panbytes);
            Files.write(aadharfilepath, aadharbytes);
            Files.write(bankfilepath, bankbytes);
            Files.write(photofilepath, photobytes);

            return new ResponseEntity<String>("success", new HttpHeaders(), HttpStatus.OK);
        } catch (IOException | IllegalStateException ex) {
            Logger.getLogger(SetDocuments.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
