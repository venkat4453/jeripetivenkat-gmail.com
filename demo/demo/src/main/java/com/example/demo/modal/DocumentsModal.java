/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.modal;

import com.mysql.cj.jdbc.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author venkateswara
 */
@Entity
@Table(name = "applicant_documents")
public class DocumentsModal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "")
    int applicants_id;

    @Column(name = "")
    @Lob
    SerialBlob pancard;
    @Column(name = "")
    @Lob
    SerialBlob aadhar;
    @Column(name = "")
    @Lob
    SerialBlob bankstatement;
    @Column(name = "")
    @Lob
    SerialBlob photo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApplicants_id() {
        return applicants_id;
    }

    public void setApplicants_id(int applicants_id) {
        this.applicants_id = applicants_id;
    }

    public SerialBlob getPancard() {
        return pancard;
    }

    public void setPancard(SerialBlob pancard) {
        this.pancard = pancard;
    }

    public SerialBlob getAadhar() {
        return aadhar;
    }

    public void setAadhar(SerialBlob aadhar) {
        this.aadhar = aadhar;
    }

    public SerialBlob getBankstatement() {
        return bankstatement;
    }

    public void setBankstatement(SerialBlob bankstatement) {
        this.bankstatement = bankstatement;
    }

    public SerialBlob getPhoto() {
        return photo;
    }

    public void setPhoto(SerialBlob photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Documents{" + "id=" + id + ", applicants_id=" + applicants_id + ", pancard=" + pancard + ", aadhar=" + aadhar + ", bankstatement=" + bankstatement + ", photo=" + photo + '}';
    }
    
    
    

}
