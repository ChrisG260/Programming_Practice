package com.chris.Collections;

import java.util.ArrayList;

public class Collection_Methods {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("lion");
		animals.add("dog");
		animals.add("cat");
		animals.add("bird");
		
		ArrayList<String> animals2 = new ArrayList<String>();
		
		animals2.add("tiger");
		animals2.add("shadow");
		
		System.out.println("animals  list: " + animals);
		System.out.println("animals2 list: " + animals2);
		
		//Merge two list
		animals.addAll(animals2);
		
		System.out.println("\nMerge List Example:");
		for(String value : animals) {
			System.out.println(value);
		}
		
		// Contains value
		System.out.println("\nDoes List contain shadow: " + animals.contains("shadow"));
		
		//Remove using another list
        animals.removeAll(animals2);
        
		System.out.println("\nRemove List 2 from List 1 Example:");
		for(String value : animals) {
			System.out.println(value);
		}
		
		// Contains value
		System.out.println("\nDoes List contain shadow: " + animals.contains("shadow"));
		
		//Check if empty
		boolean empty = animals.isEmpty();
		
		//remove all items in list
		animals.clear();
		animals2.clear();
		
		//Retain what is in second list, in first list
		animals.add("lion");
		animals.add("dog");
		animals.add("cat");
		animals.add("bird");
		
		animals2.add("cat");
		animals2.add("dog");
				
		System.out.println("\nRetain List 2 items in List 1 Example:");
		System.out.println("animals:" + animals);
		System.out.println("animals2:" + animals2);
		boolean retain = animals.retainAll(animals2);
		System.out.println("\nanimals updated with retain all: " + animals );


	
	

}

}
