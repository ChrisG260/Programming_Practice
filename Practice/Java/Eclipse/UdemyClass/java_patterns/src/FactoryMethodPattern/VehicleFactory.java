package FactoryMethodPattern;

public class VehicleFactory {
	

	public Automobile create(String make, String model, String color, int year) {
		
		Automobile auto = null;
		
		if(model.toLowerCase().equals("camaro")) {
			auto =  new Camaro();
		}else if(model.toLowerCase().equals("highlander")) {
			auto =  new Highlander();
		}else if(model.toLowerCase().equals("srx")) {
			auto =  new SRX();
		}else if(model.toLowerCase().equals("camery")) {
			auto =  new Camery();
		}
		
		if(auto != null)
		{
			auto.setMake(make);
			auto.setYear(year);
			auto.setColor(color);
		}
		
		return auto; 
	}
	
	public Automobile create(String model) {
		return create("",model,"",0); 
	}

}
