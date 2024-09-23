package com.deloitte.lab6.ex1;

import java.util.*;

public class Lab6Ex1 {

	public static List getValues(HashMap hp) {
		
		List values = new ArrayList<>(hp.values());
		Collections.sort(values);
		
		return values;
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1,10);
		hm.put(2, 15);
		hm.put(3, 8);
		hm.put(4, 12);
		hm.put(5, 20);
		
		System.out.println("Values in hashmap: "+ getValues(hm));
	}
}
