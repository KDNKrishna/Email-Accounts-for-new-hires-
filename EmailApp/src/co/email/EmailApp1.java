package co.email;

import java.util.Scanner;

public class EmailApp1 {
	private String firstName;
	private String lastName;
	private String password;
	private String alternateEmail;
	private int mailboxCapacity;
	private String department;
	
	
	//Constructor to give first name, last name
	public EmailApp1(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created:" + this.firstName + " "+ this.lastName);
		
		this.department = department();
		System.out.println("Department :"+this.department);
		
		System.out.println("Password :"+this.generatePassword(10));
		System.out.println("Email Syntax:"+this.firstName+"."+this.lastName+"@"+this.department+".company.com");
	}
	
	
	// Method to ask department
	private String department(){
		System.out.println("Enter the department: ");
		// \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 1){ return "Sales"; }
		else if (n == 2){return "Development";}
		else if (n==3){return "Accounting";}
		else {return "none";}
	
	}
	
	
	// Method to generate password
	private String generatePassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNNOPQRSTUVWXYZ012345789!@#$%^&*";
		char[] password = new char[length];
		for (int i=0; i<length; i++){
			//We are taking the length of password and multiplying with random number
			int rand = (int) (Math.random() * passwordSet.length());
			//The output is defined inside the character
			password[i] = passwordSet.charAt(rand);	
		}
		return new String(password);
		
	}
	
	// To set mailbox capacity
	public void setMailboxCapacity ( int capacity ) {
		   this.mailboxCapacity = capacity; 
		} 
	
	//To give alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String Password){
		this.password = Password;
	}
	
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	public String getAlternatEmail(){
		return alternateEmail;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String allInfo(){
		return "NAME:"+ firstName+" "+ lastName+ "; "+
				"\nMAILBOX:"+mailboxCapacity+ "; "+
				"\nEMAIL:"+alternateEmail;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailApp1 obj = new EmailApp1("Krishna", "Kdn");
		
		obj.setAlternateEmail("kdnkrishna@gmail.com");
		System.out.println("AlternateEmail:"+obj.getAlternatEmail());
		
		obj.setMailboxCapacity(200);
		System.out.println("Mailbox Capacity:"+obj.getMailboxCapacity());
		
		System.out.println("Final Information:"+obj.allInfo());
		
		
		
	}
	
	
	
}
