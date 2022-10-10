package java_classes;

// Bird is a child of Animal, Animal is it's direct parent, classes can only have one parent.
public class Bird extends Animal {

	// Constructor builds an animal object using super
	public Bird(String name, byte age, Gender gender, byte numberOfLegs){
		super(name, age, gender, numberOfLegs);
	}

	// Implementing the abstract move method from the abstract class: Animal
	@Override
	public void move() {
		System.out.println(this.name + " is moving...");
	}
}
