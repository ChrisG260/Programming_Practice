package com.chris.Collections;

import java.util.ArrayList;
import java.util.List;

public class Collection_ArrayList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		//allows any object to be added to array
		ArrayList words = new ArrayList();
		
		words.add("chris");
		words.add("gonzales");
		words.add("shadow");
		words.add(1445);
		words.add(10.0);
		words.add('g');
		
		displayArrayList(words);
		
		int index = words.indexOf("shadow");
		System.out.println("\n" + words.get(index) + " found at index " + index);
		
		words.remove(index);
		System.out.println("\nList ArrayList after removing Shadow from list");
		
		displayArrayList(words);

		// Specify data type allowed in ArrayList using parameterization
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("lion");
		animals.add("dog");
		animals.add("cat");
		animals.add("bird");

		displayArrayListFE(animals);
		
		// ArrayList using classes, by default is set to 10
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(4);
		
		vehicles.add(new Vehicle("Chevy", "Camero", 22000, false));
		vehicles.add(new Vehicle("Ford", "F150", 26000, true));
		vehicles.add(new Vehicle("Cadillac", "SRX", 36000, false));

		System.out.println("\nVehicles in List:");
		for(Vehicle value : vehicles){
			//System.out.println(value.print());
			System.out.println("\n" + value);
			System.out.println(value.print());
		}
		
		
	}
	
	// Using full for loop
	@SuppressWarnings("rawtypes")
	private static void displayArrayList(List arrayList) {
		
		// List Array items
		System.out.println("\nList ArrayList");
		for(int x = 0; x < arrayList.size(); x++){
			System.out.println(arrayList.get(x));
		}
		
	}
	
	// Using for each loop using string array list
	private static void displayArrayListFE(ArrayList<String> arrayList) {
		
		// List Array items
		System.out.println("\nList ArrayList");
		for(String value : arrayList){
			System.out.println(value);
		}
		
	}

}
