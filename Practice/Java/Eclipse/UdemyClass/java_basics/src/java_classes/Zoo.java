package java_classes;

public class Zoo {

	public static void main(String[] args) {
		
		// Creating Carnivorous Animals which inherit from animal
		//Animal(String name, byte age, Gender gender, byte numberOfLegs)
		Animal wolf = new Carnivore("Suzzy", (byte)12, Gender.FEMALE, (byte)4);
		Animal tiger = new Carnivore("Tigress", (byte)4, Gender.FEMALE, (byte)4);
		Animal lion = new Carnivore("Bob", (byte)6, Gender.MALE, (byte)4);
		
		// Calling methods from parent class
		wolf.eat();
		tiger.sleep();
		lion.walking();
		
		// Creating a Sparrow, a type of bird which inherits from Animal
		Sparrow sparrow = new Sparrow("Tom", (byte)2, Gender.MALE, (byte)2);
		
		// calling Animal Method eat, Sparrow is a bird, bird is an Animal
		sparrow.eat();
		
		// calling Sparrow method fly, Sparrow is a bird, not all birds fly, bird is an Animal 
		sparrow.fly();
		
		// Creating a type Animal but the class is a Sparrow
		Animal sparrow_2 = new Sparrow("Lacy", (byte)3, Gender.FEMALE, (byte)2);
		
		//Casting sparrow_2 from Animal to Sparrow to get to the fly method 
		((Sparrow) sparrow_2).fly();
		
		// Checking the move methods created in the classes that inherit from Animal
		sparrow.move();
		wolf.move();
		
		// Move Animals using polymorphism , determined at run time
		moveAnimal(sparrow);
		moveAnimal(wolf);
		
		// Implement flyable interface of type Sparrow
		Flyable flyingBird = new Sparrow("Macy", (byte)3, Gender.FEMALE, (byte)2);
		flyingBird.fly();

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
