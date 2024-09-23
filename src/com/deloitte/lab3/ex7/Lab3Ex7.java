package com.deloitte.lab3.ex7;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in yyyy-mm-dd");
		
		String inpDate = sc.next();
		
		LocalDate CurrDate = LocalDate.now();
		LocalDate givenDate = LocalDate.parse(inpDate);
		
		Period timeDuration = Period.between(CurrDate, givenDate);
		
		System.out.println("Duration from " + givenDate + " to " + CurrDate + ":");
		System.out.println(timeDuration.getYears() + " years");
		System.out.println(timeDuration.getMonths() + " months");
		System.out.println(timeDuration.getDays() + " days");
		
		sc.close();
	}
}
