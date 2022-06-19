package com.greatlearning.emailproblem.pojo;
import java.util.Random;
import java.util.Scanner;
public class Driverclasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Harshit","Choudari");
		System.out.println("please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		String dept = "";
		switch(choice){
		
		
			case 1:
				dept ="tech";
				break;
				
			case 2:
				dept ="admin";
				break;
				
			case 3:
				dept ="hr";
				break;
				
			case 4:
				dept ="legal";
				break;
		}
		
		CredentialService service = new CredentialService(employee);
		System.out.println("Dear "+employee.getFirstName()+"your henerated credentials are as follows: ");
		System.out.println("Email---> " + service.generateEmail());
		System.out.println("Password---> " + service.generatePassword(choice));
				
	}
		
	}


