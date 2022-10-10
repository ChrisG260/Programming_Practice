package FactoryMethodPattern;

public class SRX  extends Automobile {

	public SRX() {
		super();
		this.make = "Cadillac";
		this.model = "SRX";
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
