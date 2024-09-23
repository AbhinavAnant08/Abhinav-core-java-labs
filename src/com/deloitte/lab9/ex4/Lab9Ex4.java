package com.deloitte.lab9.ex4;

import java.util.Scanner;
import java.util.function.BiFunction;

class addition{
	
	int num1;
	int num2;
	
	public addition(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public static int add(int num1, int num2) {
		
		return (num1+num2);
	}
	
}
public class Lab9Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		BiFunction<Integer, Integer, Integer> addNum = addition::add;
		
		System.out.println("Sum of "+num1+" and "+num2+": " + addNum.apply(num1,num2));
		
		sc.close();
	}
	
}
