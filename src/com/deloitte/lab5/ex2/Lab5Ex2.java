package com.deloitte.lab5.ex2;

import java.util.Scanner;

class nameException extends Exception{
	
	nameException(String message){
		super(message);
	}
}

public class Lab5Ex2 {

	public static void main(String[] args) {
		
		String fname = "", lname = "";
		
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter your First name: ");
	     fname = sc.nextLine();
	     System.out.print("Enter your Last name: ");
	     lname = sc.nextLine();
	     
	     try {
	    	 validateName(fname, lname);
	    	 System.out.println("Valid name");
	     }
	     catch (nameException e)
	     {
	    	 System.out.println("Exception: " + e.getMessage());
	     }
	     
	}

	public static void validateName(String fname, String lname) throws nameException {
		
		if(fname.equals("")) 
			throw new nameException("First name should not be blank");
		else if(lname.equals(""))
			throw new nameException("Last name should not be blank");
	}
}
