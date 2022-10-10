package com.chris.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Collection_sort {

	public static void main(String[] args) {
		
		
		// Convert to ArrayList
		HashSet<Integer> values = new HashSet<Integer>();
		ArrayList<String> animals = new ArrayList<String>();
		
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(10);
		values.add(43);
		
		List<Integer> IList = new ArrayList<Integer>(values);
		System.out.println("Convert HashSet to ArrayList:" + IList);
		
		//Sort List
		Collections.sort(IList);
		System.out.println("Sort ArrayList:" + IList);
		animals.add("lion");
		animals.add("dog");
		animals.add("cat");
		animals.add("bird");
		Collections.sort(animals);
		System.out.println("Sort ArrayList:" + animals);
		
		// Linked Hash set, using a user defined class object, prevents duplicates but maintains order
		LinkedHashSet<Vehicle> vehicles = new LinkedHashSet<Vehicle>();
		
		vehicles.add(new Vehicle("Chevy", "Camero", 22000, false));
		vehicles.add(new Vehicle("Ford", "F150", 6000, true));
		vehicles.add(new Vehicle("Cadillac", "SRX", 36000, false));
		vehicles.add(new Vehicle("Chevy", "Camero", 22000, false));
		
		System.out.println("\n Vehicles");
		System.out.println(vehicles);
		List<Vehicle> lVehicles = new ArrayList<Vehicle>(vehicles);
		
		//Sort using Class compartTo override
		Collections.sort(lVehicles);
		System.out.println("\n sort on Make");
		System.out.println(lVehicles);
		
		//Using a comparator
		Comparator<Vehicle> compareByModel = Comparator.comparing(Vehicle::getModel);
		lVehicles.sort(compareByModel);
		System.out.println("\n sort on Model");
		System.out.println(lVehicles);
		
		//Using a comparator
		Comparator<Vehicle> compareByPrice = Comparator.comparing(Vehicle::getPrice);
		lVehicles.sort(compareByPrice);
		System.out.println("\n sort on Price");
		System.out.println(lVehicles);
		
		//Using a comparator, reverse order
		Comparator<Vehicle> compareByPriceReverse = Comparator.comparing(Vehicle::getPrice).reversed();
		lVehicles.sort(compareByPriceReverse);
		System.out.println("\n sort on Price in reverse");
		System.out.println(lVehicles);
		

	}

}
