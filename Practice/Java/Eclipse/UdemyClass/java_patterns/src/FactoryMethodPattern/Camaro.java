package FactoryMethodPattern;

public class Camaro  extends Automobile {

	public Camaro() {
		super();
		this.make = "Chevy";
		this.model = "Camaro";
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
