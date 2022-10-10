package FactoryMethodPattern;

public class Camery  extends Automobile {

	public Camery() {
		super();
		this.make = "Toyota";
		this.model = "Camery";
	}
	
	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public String getMake() {
		return this.make;
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public int getYear() {
		return this.year;
	}

}
