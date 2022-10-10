package java_classes;

// Sparrow is a Bird, which is an Animal and implements the interface Flyable
public class Sparrow extends Bird implements Flyable{
	
	public Sparrow (String name, byte age, Gender gender, byte numberOfLegs) {
		super(name, age, gender, numberOfLegs);
	}

	@Override
	public void fly() {
		System.out.println(this.name + " is flying...");
	}
	

}
