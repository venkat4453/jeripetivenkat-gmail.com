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
import javax.validation.constraints.NotNull;

/**
 *
 * @author venkateswara
 */
@Entity
@Table(name="applicants_address")
public class AddressInfoModal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Min(value = 1,message = "invzlid applicant id")
    @Column(name = "applicants_id")
    int applicantsid;
    @NotNull(message = "Address Not null")
    @Column(name = "address")
    String address;@NotNull(message = "landmark Not null")
    @Column(name = "landmark")
    String landMark;

    String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApplicantsid() {
        return applicantsid;
    }

    public void setApplicantsid(int applicantsid) {
        this.applicantsid = applicantsid;
    }
    @Column(name = "pincode")
    String pincode;
    @Column(name = "state")
    @Min(value = 1, message = "In valid state")
    String state;
    @Column(name = "city")
    @Min(value = 1, message = "In valid city")
    String city;
    @Column(name = "residenntia_status")
    @Min(value = 1, message = "In valid Residential Status")
    String residentialStatus;

    @Column(name = "permnent_address")
    String pAddress;
     public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    @Override
    public String toString() {
        return "AddressInfo{" + "id=" + id + ", applicantsid=" + applicantsid + ", address=" + address + ", landMark=" + landMark + ", pincode=" + pincode + ", state=" + state + ", city=" + city + ", residentialStatus=" + residentialStatus + ", pAddress=" + pAddress + '}';
    }

    
}

    

