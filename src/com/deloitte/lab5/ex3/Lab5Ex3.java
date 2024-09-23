package com.deloitte.lab5.ex3;

import java.util.Scanner;

class EmployeeException extends Exception{
	EmployeeException(String message){
		super(message);
	}
}

public class Lab5Ex3 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your salary: ");
	        int salary = sc.nextInt();

	        try {
	            validateSalary(salary);
	            System.out.println("Salary is valid.");
	        } 
	        catch (EmployeeException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }

public static void validateSalary(int salary) throws EmployeeException {
	if(salary < 3000)
		throw new EmployeeException("Salary must be at least 3000");
	}
}
