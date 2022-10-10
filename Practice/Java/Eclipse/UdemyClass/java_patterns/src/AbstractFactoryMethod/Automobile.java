package AbstractFactoryMethod;

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
		
	@Override
	public String toString() {
		return "Automobile [year=" + year + ",  make=" + make + ", model=" + model + " color=" + color + "]";
	}
	


}
