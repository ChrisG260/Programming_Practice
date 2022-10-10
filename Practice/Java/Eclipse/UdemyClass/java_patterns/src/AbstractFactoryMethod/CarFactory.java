package AbstractFactoryMethod;

public class CarFactory extends AbstractVehicleFactory {


	@Override
	Vehicle create(VehicleModel model) {
		switch(model) {
			case Camaro: 
				return new Camaro();
			case Camery:
				return new Camery();
			default: 
				return null;
		}
	}
	
}
