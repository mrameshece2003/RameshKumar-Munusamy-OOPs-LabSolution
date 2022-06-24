package com.labsession.app;

import java.util.Scanner;

import com.labsession.pojo.Employee;
import com.labsession.service.CredentialService;



public class DriverClass {
public static void main(String[] args) {
		
		Employee employee = new Employee("Harshit","Choudari");
		CredentialService service = new CredentialService(employee);
		System.out.println("please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		try (Scanner sc = new Scanner(System.in)) {
			int choice=sc.nextInt();
			switch(choice){
					
				case 1:
					employee.setDepartment("tech");
					break;
					
				case 2:
					employee.setDepartment("admin");
					break;
					
				case 3:
					employee.setDepartment("hr");
					break;
					
				case 4:
					employee.setDepartment("legal");
					break;
			}
			
			service.generateEmail();
			service.generatePassword(8);
			service.showCredentials();
			
	}
}
}

