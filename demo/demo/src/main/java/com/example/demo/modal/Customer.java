package com.example.demo.modal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 *
 * @author venkateswara
 */
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
    @GeneratedValue
	long id;
	@Column(name="cust_firstname")
	String name;
	@Column(name="address")
	String address;
	@Column(name="email")
	String email;
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	

}
