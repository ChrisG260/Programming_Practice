package com.chris.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection_Set {

	public static void main(String[] args) {
		
		// Sets prevent duplicates, does not maintain order
		HashSet<Integer> values = new HashSet<Integer>();
		
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(10);
		values.add(43);
		
		System.out.println("\nHashSet Example:");
		for(Integer value : values) {
			System.out.println(value);
		}
		
		// Linked Hash set, prevents duplicates but maintains order
		LinkedHashSet<Integer> values1 = new LinkedHashSet<Integer>();
		
		values1.add(12);
		values1.add(43);
		values1.add(15);
		values1.add(10);
		values1.add(43);
		
		System.out.println("\nLinkedHashSet Example:");
		for(Integer value : values1) {
			System.out.println(value);
		}
		
		// Linked Hash set, using a user defined class object, prevents duplicates but maintains order
		LinkedHashSet<Vehicle> vehicles = new LinkedHashSet<Vehicle>();
		
		vehicles.add(new Vehicle("Chevy", "Camero", 22000, false));
		vehicles.add(new Vehicle("Ford", "F150", 26000, true));
		vehicles.add(new Vehicle("Cadillac", "SRX", 36000, false));
		vehicles.add(new Vehicle("Chevy", "Camero", 22000, false));
		
		System.out.println("\nLinkedHashSet Example:");
		for(Vehicle value : vehicles) {
			System.out.println(value);
		}
		
		
	}

}
