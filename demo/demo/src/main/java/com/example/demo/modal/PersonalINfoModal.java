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
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 *
 * @author venkateswara
 */
@Entity
@Table(name = "applicants_personal_data")
public class PersonalINfoModal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "applicants_id")
    int applicantid;

//    @Column(name = "mobile")
//    long mmmobile;
    @Min(value = 1, message = "In valid qualification")
    @Column(name = "aadhar_number")
    String aadhar;
    @Min(value = 1, message = "In valid qualification")
    @Column(name = "qualification")
    String qualification;
    @Column(name = "mother_name")
    String motherName;
    @Column(name = "father_or_spouse_name")

    String fatherOrSpouseName;
    @Column(name = "maritial_status")
    @Min(value = 1, message = "In valid Maritian Status")
    String maritianStatus;
    @Column(name = "number_of_children")
    int numOfChildren;

    String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    @Override
    public String toString() {
        return "PersonalINfo{" + "id=" + id + ", applicantid=" + applicantid + ", aadhar=" + aadhar + ", qualification=" + qualification + ", motherName=" + motherName + ", fatherOrSpouseName=" + fatherOrSpouseName + ", maritianStatus=" + maritianStatus + ", numOfChildren=" + numOfChildren + '}';
    }

    public int getApplicantid() {
        return applicantid;
    }

    public void setApplicantid(int applicantid) {
        this.applicantid = applicantid;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherOrSpouseName() {
        return fatherOrSpouseName;
    }

    public void setFatherOrSpouseName(String fatherOrSpouseName) {
        this.fatherOrSpouseName = fatherOrSpouseName;
    }

    public String getMaritianStatus() {
        return maritianStatus;
    }

    public void setMaritianStatus(String maritianStatus) {
        this.maritianStatus = maritianStatus;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

}
