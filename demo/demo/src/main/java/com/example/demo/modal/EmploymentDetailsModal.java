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

/**
 *
 * @author venkateswara
 */
@Entity
@Table(name = "applicant_employment_data")
public class EmploymentDetailsModal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "applicants_id")
    private int applicantid;
    @Column(name = "employment_type")
    private int employmenttype;
    @Column(name = "total_experience")
    private int totalexperience;
    @Column(name = "monthly_salary")
    private long salary;
    @Column(name = "monthly_expense")
    private long expenses;
    @Column(name = "company_name")
    private String companyname;
    @Column(name = "designation")
    private String designation;
    @Column(name = "joining_year")
    private int joiningyear;
    @Column(name = "gstn_number")
    private String gstnnumber;
    @Column(name = "constitution")
    private String constitution;
    @Column(name = "business_catagery")
    private String businesscategory;
    @Column(name = "name_of_industry")
    private String industryname;
    @Column(name = "sub_industry")
    private String subindustry;
    @Column(name = "business_vintage")
    private String businessvintage;
    @Column(name = "segment_of_business")
    private String businesssegemnt;
    @Column(name = "annual_turnover")
    private long annualturnover;
    @Column(name = "earning_member")
    private String earningmember;
    @Column(name = "household_income")
    private long householdincome;

    public int getApplicantid() {
        return applicantid;
    }

    public void setApplicantid(int applicantid) {
        this.applicantid = applicantid;
    }

    public int getEmploymenttype() {
        return employmenttype;
    }

    public void setEmploymenttype(int employmenttype) {
        this.employmenttype = employmenttype;
    }

    public int getTotalexperience() {
        return totalexperience;
    }

    public void setTotalexperience(int totalexperience) {
        this.totalexperience = totalexperience;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getExpenses() {
        return expenses;
    }

    public void setExpenses(long expenses) {
        this.expenses = expenses;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getJoiningyear() {
        return joiningyear;
    }

    public void setJoiningyear(int joiningyear) {
        this.joiningyear = joiningyear;
    }

    public String getGstnnumber() {
        return gstnnumber;
    }

    public void setGstnnumber(String gstnnumber) {
        this.gstnnumber = gstnnumber;
    }

    public String getConstitution() {
        return constitution;
    }

    public void setConstitution(String constitution) {
        this.constitution = constitution;
    }

    public String getBusinesscategory() {
        return businesscategory;
    }

    public void setBusinesscategory(String businesscategory) {
        this.businesscategory = businesscategory;
    }

    public String getIndustryname() {
        return industryname;
    }

    public void setIndustryname(String industryname) {
        this.industryname = industryname;
    }

    public String getSubindustry() {
        return subindustry;
    }

    public void setSubindustry(String subindustry) {
        this.subindustry = subindustry;
    }

    public String getBusinessvintage() {
        return businessvintage;
    }

    public void setBusinessvintage(String businessvintage) {
        this.businessvintage = businessvintage;
    }

    public String getBusinesssegemnt() {
        return businesssegemnt;
    }

    public void setBusinesssegemnt(String businesssegemnt) {
        this.businesssegemnt = businesssegemnt;
    }

    public long getAnnualturnover() {
        return annualturnover;
    }

    public void setAnnualturnover(long annualturnover) {
        this.annualturnover = annualturnover;
    }

    public String getEarningmember() {
        return earningmember;
    }

    public void setEarningmember(String earningmember) {
        this.earningmember = earningmember;
    }

    public long getHouseholdincome() {
        return householdincome;
    }

    public void setHouseholdincome(long householdincome) {
        this.householdincome = householdincome;
    }

    @Override
    public String toString() {
        return "EmploymentDetails{" + "applicantid=" + applicantid + ", employmenttype=" + employmenttype + ", totalexperience=" + totalexperience + ", salary=" + salary + ", expenses=" + expenses + ", companyname=" + companyname + ", designation=" + designation + ", joiningyear=" + joiningyear + ", gstnnumber=" + gstnnumber + ", constitution=" + constitution + ", businesscategory=" + businesscategory + ", industryname=" + industryname + ", subindustry=" + subindustry + ", businessvintage=" + businessvintage + ", businesssegemnt=" + businesssegemnt + ", annualturnover=" + annualturnover + ", earningmember=" + earningmember + ", householdincome=" + householdincome + '}';
    }

}
