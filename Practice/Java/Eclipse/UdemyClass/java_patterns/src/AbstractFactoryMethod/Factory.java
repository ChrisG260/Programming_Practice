package AbstractFactoryMethod;

public class Factory {
	
	public static AbstractVehicleFactory create(VehicleType type)
	{
		switch(type) {
			case CAR: 
				return new CarFactory();
			case TRUCK:
				return new TruckFactory();
			case BOAT:
				return new BoatFactory();
			default:
				return null;
		}  
	}

}
