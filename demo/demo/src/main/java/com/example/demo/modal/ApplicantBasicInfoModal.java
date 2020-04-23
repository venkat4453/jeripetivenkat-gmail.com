package com.example.demo.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "applicants")
public class ApplicantBasicInfoModal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int applicant_id;
    @Column(name = "pan_number")
    @NotNull(message = "pan number not null")
    private String pannumber;
    @NotNull(message = "first name not null")
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "middle_name")
    private String middlename;
    @NotNull(message = "last name not null")
    @Column(name = "last_name")
    private String lastname;
    @NotNull(message = "email not null")
    @Email
    @Column(name = "email_id")
    private String email;
    @NotEmpty(message = "mobile not null")
    @NotNull(message = "mobile not null")
    @Column(name = "mobile")
    private String mobile;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "dob")
    @NotNull(message = "Dob not null")
    private Date dob;

    @Override
    public String toString() {
        return "ApplicantBasicInfoModal{" + "applicant_id=" + applicant_id + ", pan_number=" + pannumber + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", email=" + email + ", mobile=" + mobile + ", dob=" + dob + '}';
    }

    public int getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(int applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getPan_number() {
        return pannumber;
    }

    public void setPan_number(String pan_number) {
        this.pannumber = pan_number;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
