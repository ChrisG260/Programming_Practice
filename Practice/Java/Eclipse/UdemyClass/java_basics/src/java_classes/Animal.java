package java_classes;

// Example Abstract class
// Abstract classes can not be implemented only inherited
public abstract class Animal {
		
	byte age;
	byte numberOfLegs;
	Gender gender;
	String name;
	
	public Animal() {
		this.age = 0;
		this.numberOfLegs = 0;
		this.gender = Gender.FEMALE;
		this.name = "";
	}

	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param numberOfLegs
	 */
	public Animal(String name, byte age, Gender gender, byte numberOfLegs) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.numberOfLegs = numberOfLegs;
	}
	
	public void eat() {
		System.out.println(this.name + " is eating....");
	}
	
	public void sleep() {
		System.out.println(this.name + " is sleeping....");
	}
	
	public void walking() {
		System.out.println(this.name + " is walking....");
	}
	
	//Abstract method must be implemented by each class that inherits from this class
	public abstract void move();

	
}
