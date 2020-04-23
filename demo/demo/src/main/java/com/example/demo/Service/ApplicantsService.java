/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Service;


import com.example.demo.dto.service.AddressInfoservice;
import com.example.demo.dto.service.BankDetailsService;
import com.example.demo.dto.service.BasicInfoService;
import com.example.demo.dto.service.DocumentsService;
import com.example.demo.dto.service.EmploymentDetailsService;
import com.example.demo.dto.service.PersonalInfoService;
import com.example.demo.modal.AddressInfoModal;
import com.example.demo.modal.ApplicantBasicInfoModal;
import com.example.demo.modal.BnakDetailsModal;
import com.example.demo.modal.DocumentsModal;
import com.example.demo.modal.EmploymentDetailsModal;
import com.example.demo.modal.PersonalINfoModal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author venkateswara
 */
@Service
public class ApplicantsService {

    private static final org.slf4j.Logger log
            = org.slf4j.LoggerFactory.getLogger(ApplicantsService.class);

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

    public ResponseEntity<DocumentsModal> saveDocuments(DocumentsModal documents) {
        
        docsrepo.saveDocuments(documents);
        return new ResponseEntity<DocumentsModal>(documents, new HttpHeaders(), HttpStatus.OK);

    }
    public ResponseEntity<PersonalINfoModal> savePersonalInfo(PersonalINfoModal personalinfo,String mobile) {
       System.out.println("mobile number " + mobile);
       log.info("hi before");
        int applicantid = repository.findByMobile(mobile);
        log.info("hi afetr");
        log.info("mobile applicant id   ::::: " + applicantid);
        personalinfo.setApplicantid(applicantid);
        System.out.println(personalinfo.toString());
        personalinforepository.createOrUpdateCustomer(personalinfo);
        return new ResponseEntity<PersonalINfoModal>(personalinfo, new HttpHeaders(), HttpStatus.OK);

    }
    public ResponseEntity<EmploymentDetailsModal> saveEmploymentDetails(EmploymentDetailsModal employmentinfo,String mobile) {
         System.out.println(employmentinfo.toString());
        System.out.println("mobile number " + mobile);
        int applicantid = repository.findByMobile(mobile);
        System.out.println("mobile applicantidapplicantidapplicantidapplicantid " + applicantid);
        employmentinfo.setApplicantid(applicantid);
        System.out.println(employmentinfo.toString());
        employmentdetailsrepository.createOrUpdateCustomer(employmentinfo);
        return new ResponseEntity<EmploymentDetailsModal>(employmentinfo, new HttpHeaders(), HttpStatus.OK);

    }
    public ResponseEntity<BnakDetailsModal> saveBankDetails(BnakDetailsModal bankdetails,String mobile) {
          System.out.println(bankdetails.toString());
        System.out.println("mobile number " + mobile);
        int applicantid = repository.findByMobile(mobile);
        System.out.println("mobile applicantidapplicantidapplicantidapplicantid " + applicantid);
        bankdetails.setApplicantId(applicantid);
        System.out.println(bankdetails.toString());
//            System.out.println(applicantinfo.getPersonalinfo().toString());
        bankdetailsrepository.createOrUpdateCustomer(bankdetails);
        return new ResponseEntity<BnakDetailsModal>(bankdetails, new HttpHeaders(), HttpStatus.OK);

    }
    public ResponseEntity<AddressInfoModal> saveAddressDetails(AddressInfoModal address,String mobile) {
           System.out.println(address.toString());
        System.out.println("mobile number " + mobile);
        int applicantid = repository.findByMobile(mobile);
        System.out.println("mobile applicantidapplicantidapplicantidapplicantid " + applicantid);
        address.setApplicantsid(applicantid);
        System.out.println(address.toString());
//            System.out.println(applicantinfo.getPersonalinfo().toString());
        addressrepo.createOrUpdateCustomer(address);
        return new ResponseEntity<AddressInfoModal>(address, new HttpHeaders(), HttpStatus.OK);

    }
    public String  saveApplicantBasicInfo(ApplicantBasicInfoModal applicantinfo) {
           log.info(applicantinfo.toString());
        repository.createOrUpdateCustomer(applicantinfo);
        return "success";

    }
}
