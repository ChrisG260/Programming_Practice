package FactoryMethodPattern;

import java.lang.reflect.InvocationTargetException;

public class FactoryMethodApp {
	
	/* 
	 * Factory Method: Removes the direct creation of the concrete classes from the user. 
	 * Instead the factory is used to select and create the concrete class, behind the scenes.
	 * 
	 * This allows for a single class, the main interface used by all the concrete classes, to hold any of the 
	 * created classes and be reused or replaced. 
	 * 
	 * I use a generic version at the end which should allow for any type, and handle the casting to the sub type desired.
	 */

	public static void main(String[] args) {
		
		VehicleFactory factory = new VehicleFactory();
		
		Automobile auto = null;
		
		//String make, String model, String color, int year
		
		//Create a Cammarro
		System.out.print("Creating a Camaro: ");
		auto = factory.create("camerro");
		System.out.println(auto);
		
		//Create a SRX
		System.out.print("Creating a SRX: ");
		auto = factory.create("Cadillac", "SRX", "Gray", 2012);
		System.out.println(auto);
				
		//Create Camery using Vehicle
		System.out.print("Creating a Camery: ");
		Vehicle vehicle = factory.create("Toyota", "Camery", "White", 2012);
		System.out.println(vehicle.getMake());
		System.out.println(vehicle);
		
		//Using Generic Factory to create the class
		System.out.print("Creating a Camery: ");
		GenericFactory<Highlander, Automobile> factoryGen =  new GenericFactory<Highlander, Automobile>(Highlander.class);
		try {
			Automobile vehicleGen = factoryGen.createInstance();
			vehicleGen.setColor("Yellow");
			vehicleGen.setYear(2020);
			System.out.println(vehicleGen.getMake());
			System.out.println(vehicleGen);
		} catch (IllegalAccessException | InstantiationException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}


	}

}
