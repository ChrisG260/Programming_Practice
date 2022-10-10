package FactoryMethodPattern;

public abstract class Automobile implements Vehicle {
	
	int year;
	String color;
	String make;
	String model;
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Automobile [year=" + year + ",  make=" + make + ", model=" + model + " color=" + color + "]";
	}
	


}
