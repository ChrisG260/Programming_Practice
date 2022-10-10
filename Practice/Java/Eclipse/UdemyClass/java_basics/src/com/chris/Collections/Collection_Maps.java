package com.chris.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Collection_Maps {

	public static void main(String[] args) {
		
		//Map is a dictionary, <key, Value>, HashMap does not maintain order of insertion
		HashMap<String, String> dictonary = new HashMap<String, String>();
		dictonary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictonary.put("Courge", "the ability to do something that frightens one.");
		dictonary.put("Valor", "great courage in the face of danger, especially in battle.");
		dictonary.put("Heroism", "great bravery.");
		
		System.out.println("HashMap Example");
		for(String value : dictonary.keySet()) {
			System.out.println("Key: " + value + " ; Value: " + dictonary.get(value));
		}
		
		//Map is a dictionary, <key, Value>, LinkedHashMap maintains order of insertion
		LinkedHashMap<String, String> dictonaryLinked = new LinkedHashMap<String, String>();
		dictonaryLinked.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictonaryLinked.put("Courge", "the ability to do something that frightens one.");
		dictonaryLinked.put("Valor", "great courage in the face of danger, especially in battle.");
		dictonaryLinked.put("Heroism", "great bravery.");
		
		System.out.println("\nLinkedHashMap Example");
		for(String value : dictonaryLinked.keySet()) {
			System.out.println("Key: " + value + " ; Value: " + dictonaryLinked.get(value));
		}
		
		System.out.println("\nHashMap Example using Entry");
		for(Entry<String, String> set : dictonary.entrySet()) {
			System.out.println("Key: " + set.getKey() + " ; Value: " + set.getValue());
		}
		
		//Treemap maintains natural order
		TreeMap<String, String> dictonary1 = new TreeMap<String, String>();
		dictonary1.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictonary1.put("Courge", "the ability to do something that frightens one.");
		dictonary1.put("Valor", "great courage in the face of danger, especially in battle.");
		dictonary1.put("Heroism", "great bravery.");
		
		System.out.println("\nTreeMap Example using Entry, sorts by key");
		for(Entry<String, String> set : dictonary1.entrySet()) {
			System.out.println("Key: " + set.getKey() + " ; Value: " + set.getValue());
		}
		
		//Treemap maintains natural order using custom class
		TreeMap<Integer, Vehicle> vehicles = new TreeMap<Integer, Vehicle>();
		Vehicle vehicle1 = new Vehicle("Chevy", "Camero", 22000, false);
		Vehicle vehicle2 = new Vehicle("Ford", "F150", 26000, true);
		Vehicle vehicle3 = new Vehicle("Cadillac", "SRX", 36000, false);
		Vehicle vehicle4 = new Vehicle("Cadillac", "SRX", 36000, false);
		 
		vehicles.put(vehicle1.hashCode(), vehicle1);
		vehicles.put(vehicle2.hashCode(), vehicle2);
		vehicles.put(vehicle3.hashCode(), vehicle3);
		
		//Test if duplicate key will change content
		vehicles.put(vehicle4.hashCode(), vehicle4);
		
		System.out.println("\nTreeMap Example using Custom Class");
		for(Entry<Integer, Vehicle> set : vehicles.entrySet()) {
			System.out.println("Key: " + set.getKey() + " ; Value: " + set.getValue());
		}
		
		

	}

}
