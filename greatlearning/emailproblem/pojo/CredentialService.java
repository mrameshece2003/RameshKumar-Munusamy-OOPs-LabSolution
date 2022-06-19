package com.greatlearning.emailproblem.pojo;
import java.util.Random;
public class CredentialService {

	private Employee combinedChars;

	public char [] generatePassword(int length) {
		String capitalCaseLetter ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacter ="!@#$";
		String number ="1234567890";
		String combinerChars = capitalCaseLetter + lowerCaseLetter + specialCharacter + number;
		Random random =new Random();
		char[] password=new char[8]; 
			
		password[0] =lowerCaseLetter.charAt(random.nextInt(lowerCaseLetter.length()));
		password[1] =capitalCaseLetter.charAt(random.nextInt(capitalCaseLetter.length()));
		password[2] =specialCharacter.charAt(random.nextInt(specialCharacter.length()));
		password[3] =number.charAt(random.nextInt(number.length()));
		
		for (int i = 4; i<length; i++) { 
			password[i]= combinerChars.charAt(random.nextInt(combinedChars.length()));
			
		}
		return password; 
		
		}	
		public String generateEmail() {

			Employee employee = new Employee("Harshit", "Choudary");
			String mail = employee.getFirstName()+ employee.getLastName()+ "Admin.gl.com";
			return mail;
			
			}
		public CredentialService(Employee employee) {
			super();
			this.combinedChars = employee;
		}
}
