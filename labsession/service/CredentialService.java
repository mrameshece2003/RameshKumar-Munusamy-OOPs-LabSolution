package com.labsession.service;
import java.util.Random;
import com.labsession.pojo.*;

public class CredentialService {
	Employee employee;
	
	public void generatePassword(int length) {
		String capitalCaseLetter ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacter ="!@#$";
		String number ="1234567890";
		String combinedChars = capitalCaseLetter + lowerCaseLetter + specialCharacter + number;
		Random random =new Random();
		char[] passwordarray=new char[length]; 
			
		passwordarray[0] =lowerCaseLetter.charAt(random.nextInt(lowerCaseLetter.length()));
		passwordarray[1] =capitalCaseLetter.charAt(random.nextInt(capitalCaseLetter.length()));
		passwordarray[2] =specialCharacter.charAt(random.nextInt(specialCharacter.length()));
		passwordarray[3] =number.charAt(random.nextInt(number.length()));
		
		for (int i = 4; i<length; i++) { 
			passwordarray[i]= combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		
		String password = new String(passwordarray);
		employee.setPassword(password);
		}	
		public CredentialService(Employee employee) {
		super();
		this.employee = employee;
		}
		public void generateEmail() {

		employee.setEmail(employee.getFirstName()+ employee.getLastName()+ "@"+employee.getDepartment()+".gl.com");
		}
		public void showCredentials() {
			System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
			System.out.println("Email---> " +employee.getEmail());
			System.out.println("Password---> " +employee.getPassword());
			
		}	
		}




