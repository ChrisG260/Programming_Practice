package java_classes;

public class Carnivore extends Animal{

	public Carnivore(String name, byte age, Gender gender, byte numberOfLegs) {
		super(name, age, gender, numberOfLegs);
	}
	
	// Implementing the abstract move method from the abstract class: Animal
	@Override
	public void move() {
		System.out.println(this.name + " is running...");
	}
	
	

}
