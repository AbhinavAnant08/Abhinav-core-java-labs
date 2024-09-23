package com.deloitte.lab9.ex1;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Lab9Ex1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x");
		int x = sc.nextInt();
		
		System.out.println("Enter y");
		int y = sc.nextInt();
		
		BiFunction<Integer, Integer, Double> power = (n,m) -> Math.pow(x, y);
		
		System.out.println("X raised to the power Y: "+power.apply(x, y));
		
		sc.close();
	}

}
