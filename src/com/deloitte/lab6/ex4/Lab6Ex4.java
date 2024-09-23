package com.deloitte.lab6.ex4;

import java.util.*;

public class Lab6Ex4 {
	
	public static HashMap<String, String> getStudents(HashMap<String, Double> marks)
	{
		HashMap<String, String> scholarship = new HashMap<>();
		
		for (Map.Entry<String, Double> stuMarks: marks.entrySet())
		{
			if(stuMarks.getValue() >= 90.0)
				scholarship.put(stuMarks.getKey(), "Gold");
			else if(stuMarks.getValue() >= 80 && stuMarks.getValue() < 90)
					scholarship.put(stuMarks.getKey(), "Silver");
			else if(stuMarks.getValue() >= 70 && stuMarks.getValue() < 80)
					scholarship.put(stuMarks.getKey(), "Bronze");
		}
		
		return scholarship;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> marks = new HashMap<>();
		
		System.out.println("Enter number of students");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i<num; i++)
			{
			System.out.println("Enter registration number and marks");
			String input = sc.nextLine();
			String[] str = input.split(" ");
			marks.put(str[0], Double.parseDouble(str[1]));
			}
		
		System.out.println("Eligible Students: "+ getStudents(marks));
		sc.close();
	}

}
