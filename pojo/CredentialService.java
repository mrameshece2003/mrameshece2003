package com.greatlearning.emailproblem.pojo;
import java.util.Random;
	
public class CredentialService {

	private Employee combinedChars;{

	}
	public Employee getCombinedChars() {
		return combinedChars;
	}
	public void setCombinedChars(Employee combinedChars) {
		this.combinedChars = combinedChars;
	}
	public char [] generatePassword(int length) {
		String capitalCaseLetter ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacter ="!@#$";
		String number ="1234567890";
		String combinedChars = capitalCaseLetter + lowerCaseLetter + specialCharacter + number;
		Random random =new Random();
		char[] password=new char[length]; 
			
		password[0] =lowerCaseLetter.charAt(random.nextInt(lowerCaseLetter.length()));
		password[1] =capitalCaseLetter.charAt(random.nextInt(capitalCaseLetter.length()));
		password[2] =specialCharacter.charAt(random.nextInt(specialCharacter.length()));
		password[3] =number.charAt(random.nextInt(number.length()));
		
		for (int i = 4; i<length; i++) { 
			password[i]= combinedChars.charAt(random.nextInt(combinedChars.length()));
			
		}
		return password; 
		
		}	
		public String generateEmail() {

			Employee employee = new Employee("Harshit", "Choudary");
			String mail = employee.getFirstName()+ employee.getLastName()+ "@"+"department"+".gl.com";
			return mail;
			}
		public CredentialService(Employee employee) {
			super();
			this.combinedChars = employee;
		}
		public void showCredentials() {
			System.out.println("Dear " + employee.getFirstName() + "your generated credentials are as follows");
			System.out.println("Email---> " +generateEmail());
			int i = 0;
			System.out.println("Password---> " +password(i));
			
		}
		private String password(int i) {
			// TODO Auto-generated method stub
			return null;
		}
}
