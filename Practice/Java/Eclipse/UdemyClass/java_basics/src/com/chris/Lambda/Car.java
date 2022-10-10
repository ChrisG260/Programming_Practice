package com.chris.Lambda;

public class Car {
	String make, model, color;
	double price;
	
	/**
	 * @param make
	 * @param model
	 * @param color
	 * @param price
	 */
	public Car(String make, String model, String color, double price) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printCar() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	
}
