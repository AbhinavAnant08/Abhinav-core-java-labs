package com.deloitte.lab6.ex6;
import java.util.*;

public class Lab6Ex6 {

	public static List<String> votersList(HashMap<String, Integer> age)
	{
		List<String> eligibleToVote = new ArrayList<>();
		
		for(Map.Entry<String, Integer> ageMap : age.entrySet()) {
			if (ageMap.getValue() > 18)
				eligibleToVote.add(ageMap.getKey());
		}
		
		return eligibleToVote;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> age = new HashMap<>();
		
		System.out.println("Enter number of students");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i<num; i++)
			{
			System.out.println("Enter uid and age");
			String input = sc.nextLine();
			String[] str = input.split(" ");
			age.put(str[0], Integer.parseInt(str[1]));
			}
		
		System.out.println("Eligible to vote: "+ votersList(age));
		sc.close();
	}
}