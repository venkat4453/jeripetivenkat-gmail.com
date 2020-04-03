package com.example.demo;

import java.util.regex.Pattern;

/**
 *
 * @author venkateswara
 */
public class ValidateEmailAndPwd {
	public  boolean validateUsername(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}
	public  boolean validatePassword(String pwd) {
		String emailRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (pwd == null)
			return false;
		return pat.matcher(pwd).matches();
	}
//	 public static void main(String[] args) 
//	    { 
//	        String email = "enkat@gmail.com"; 
//	        ValidateEmailAndPwd obj=new ValidateEmailAndPwd();
//	        if (obj.validateUsername(email)) 
//	            System.out.print("Yes"); 
//	        else
//	            System.out.print("No"); 
//	    } 
}
