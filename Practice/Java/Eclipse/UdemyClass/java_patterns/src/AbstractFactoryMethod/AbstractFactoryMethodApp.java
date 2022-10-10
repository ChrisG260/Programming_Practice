package AbstractFactoryMethod;

public class AbstractFactoryMethodApp {
	
	/*
		Abstract factory : Factory of factories. Concrete Classes, in this example: Camaro, F150, Ski_Fish, 
		all have something in common but typically operate on different platforms. Car is used to travel on land 
		typically caring passengers, truck can have passengers but typically used to move cargo on land, and a Boat carries 
		passengers or cargo on water. The Truck factory makes trucks, Car factory cars and Boat factory boats.
		
		They are all vehicles, the interface, 
		all have Year, Make, Model, Color attributes, but are separated by use.
		
		The user has access to the abstract factories for each platform, then uses that to create the concrete classes it needs.
	*/ 

	public static void main(String[] args) {
		
		AbstractVehicleFactory vehicleFactory = Factory.create(VehicleType.CAR);
		
		Automobile car = (Automobile)vehicleFactory.create(VehicleModel.Camaro);
		car.setColor("Blue");
		car.setYear(1964);
		System.out.println(car);
		
		vehicleFactory = Factory.create(VehicleType.BOAT);
		
		Boat boat = (Boat)vehicleFactory.create(VehicleModel.Ski_Fish);
		boat.setColor("White");
		boat.setYear(2021);
		System.out.println(boat);
		
		vehicleFactory = Factory.create(VehicleType.TRUCK);
		
		Truck truck = (Truck)vehicleFactory.create(VehicleModel.F150); 
		truck.setColor("Red");
		truck.setYear(1992);
		System.out.println(truck);
		
		// cast the interface to the type
		Vehicle vehicle = vehicleFactory.create(VehicleModel.F150); 
		((Truck)vehicle).setColor("Black");
		((Truck)vehicle).setYear(1998);
		System.out.println(vehicle);

	}

}
