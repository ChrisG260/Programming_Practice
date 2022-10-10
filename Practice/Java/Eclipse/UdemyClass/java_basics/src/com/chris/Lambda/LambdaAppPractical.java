package com.chris.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaAppPractical {

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);
		
		// This is how you would need to do it if not using lambdas
		System.out.println("Printing cars between price 18000 and 22000");
		printCarsPriceRange(cars, 18000, 22000);
		
		System.out.println("Print blue cars");
		printCarByColor(cars, "Red");
		/////////////////
		
		// Using lambdas and only one procedure that is now more flexible
		System.out.println("Printing cars between price 18000 and 22000");
		printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);

		// Using Predicate, which takes the type
		System.out.println("Print blue cars");
		printCarsPred(cars, (c) -> c.getColor().equals("Blue"));
		////
		
		// Using built in generic Functional Interface
		Function<Car, String> priceAndColor = (c) -> " price = " + c.getPrice() + " color = "+ c.getColor();			
		String stringCar = priceAndColor.apply(cars.get(0));
		System.out.println(stringCar);

	}
	
	// Combine the printCarsPriceRange and printCarByColor into one function
	// can also use the lambdas to test for any condition we want using this function vs having to write out each one
	public static void printCars(List<Car> cars, CarCondition condition) {
		for(Car c: cars) {
			if(condition.test(c)) {
				c.printCar();
			}
		}
	}
	
	// Same as above, only you do not need to define the CarCondition interface
	// using predicate is a built in generic version of the the functional interface using test conditions 
	public static void printCarsPred(List<Car> cars, Predicate<Car> predicate) {
		for(Car c: cars) {
			if(predicate.test(c)) {
				c.printCar();
			}
		}
	}

	/// Long way without lambdas
	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
		for(Car c: cars) {
			if(low <= c.getPrice() && c.getPrice() <= high) {
				c.printCar();
			}
		}
	}


	public static void printCarByColor(List<Car> cars, String color) {
		for(Car c: cars) {
			if(c.getColor().equals(color)) {
				c.printCar();
			}
		}
	}
	///////////////////




}

@FunctionalInterface
interface CarCondition {
	public boolean test(Car c);
}
