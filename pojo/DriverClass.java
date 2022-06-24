package com.greatlearning.emailproblem.pojo;
import java.util.Scanner;
public class DriverClass {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Harshit","Choudari");
		System.out.println("please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		try (Scanner sc = new Scanner(System.in)) {
			int choice=sc.nextInt();
			String Department = "";
			switch(choice){
					
				case 1:
					Department ="tech";
					break;
					
				case 2:
					Department ="admin";
					break;
					
				case 3:
					Department ="hr";
					break;
					
				case 4:
					Department ="legal";
					break;
			}
			
			CredentialService service = new CredentialService(employee);
			System.out.println("Dear "+Employee.getFirstName()+"your generated credentials are as follows: ");
			System.out.println("Email---> " + service.generateEmail());
			System.out.println("Password---> " + service.generatePassword(choice));
		}
			
	}
	}


