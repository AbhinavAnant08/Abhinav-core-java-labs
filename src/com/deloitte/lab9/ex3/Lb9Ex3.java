package com.deloitte.lab9.ex3;

import java.util.Scanner;

public class Lb9Ex3 {
	
	interface verifyCredentials{
		
		public boolean verify(String username, String password);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		verifyCredentials vc = (username, password) -> {
			
			if(username.equals("abcd") && password.equals("1234"))
				return true;
			else
				return false;
		};
		
		System.out.println("Eneter username: ");
		String un = sc.next();
		
		System.out.println("Eneter password: ");
		String pass = sc.next();
		
		if(vc.verify(un, pass))
			System.out.println("Correct Credentials");
		else
			System.out.println("Incorrect Credentials");
		
		sc.close();
	}

}
