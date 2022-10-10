package com.chris.Collections;

import java.util.LinkedList;

public class Collection_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> words = new LinkedList<String>();
		
		words.add("chris");
		words.add("gonzales");
		words.add("shadow");
		
		outputlistArray(words);
			
		// Use Wrapper classes for primitive data types like: int, float, double
		LinkedList<Integer> iNumbers = new LinkedList<Integer>();
		
		iNumbers.add(10);
		iNumbers.add(20);
		iNumbers.add(30);
		iNumbers.add(10);
		
		outputIntegerListArray(iNumbers);
		
		/*
		 * Short cut for traversing a collections list
		 */
		System.out.println("\nList ArrayList shorter notation");
		for(int number : iNumbers) {
			System.out.println(number);
		}
		

	}
	
	// Use pop, which returns and removes from list, FIFO
	private static void outputlistArray(LinkedList<String> list) {
		
		if(list == null) return;
		// List Array items
		System.out.println("\nList ArrayList");
		while(!list.isEmpty()) {
			System.out.println(list.pop());
		}
		
	}
	
	// Iterates through list rather than removing, FIFO
	private static void outputIntegerListArray(LinkedList<Integer> list) {
		
		if(list == null) return;
		
		// List Array items
		System.out.println("\nList ArrayList");
		for(int x = 0; x < list.size(); x++){
			System.out.println(list.get(x));
		}
		

		
	}

}
