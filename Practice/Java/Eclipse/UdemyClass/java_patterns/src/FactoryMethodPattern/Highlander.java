package FactoryMethodPattern;

public class Highlander extends Automobile{

	public Highlander() {
		super();
		this.make = "Toyota";
		this.model = "Highlander";
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
