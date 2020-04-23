/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author venkateswara
 */
@Entity
@Table(name = "applicant_bank_details")
public class BnakDetailsModal implements Serializable {

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    @Override
    public String toString() {
        return "BnakDetails{" + "applicantId=" + applicantId + ", bankName=" + bankName + ", accountNumber=" + accountNumber + ", accountType=" + accountType + ", ifscCode=" + ifscCode + '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "applicants_id")
    private int applicantId;
    @Column(name = "bank_name")
    @NotNull(message = "bank Name not null")
    String bankName;
    @Column(name = "account_number")
    @NotNull(message = "Account Number not null")
    String accountNumber;
    @Column(name = "account_type")
    String accountType;
    @NotNull(message = "IFSC Code not null")
    @Column(name = "ifsc_code")
    String ifscCode;

    
    String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
