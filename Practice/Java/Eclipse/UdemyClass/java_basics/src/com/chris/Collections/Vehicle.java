package com.chris.Collections;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {
	
	private String make;
	private String model;
	private int price;
	private boolean fwd;
	
	public Vehicle(String make, String modle, int price, boolean fwd) {
		super();
		this.make = make;
		this.model = modle;
		this.price = price;
		this.fwd = fwd;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFwd() {
		return fwd;
	}
	public void setFwd(boolean fwd) {
		this.fwd = fwd;
	}
	
	public String print() {
		
		return ("\nMake: " + this.make +
				"\nModel: " + this.model + 
				"\nPrice: $" + String.format("%,d", this.price) +
				"\nFour Wheel Drive: " + this.fwd);
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=$" + String.format("%,d", this.price) + ", fwd=" + fwd + "]";
	}
	
	// Need to override the hashcode and equals for comparing for duplicates using the fields of the class

	@Override
	public int hashCode() {
		return Objects.hash(fwd, make, model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return fwd == other.fwd && Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& price == other.price;
	}

	@Override
	public int compareTo(Vehicle o) {
		return this.make.compareTo(o.getMake());
	}

	
	
	
}
