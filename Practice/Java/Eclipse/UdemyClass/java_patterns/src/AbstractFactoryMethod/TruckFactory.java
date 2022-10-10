package AbstractFactoryMethod;

public class TruckFactory extends AbstractVehicleFactory {

	@Override
	Vehicle create(VehicleModel model) {
		switch(model) {
			case F150: 
				return new F150();
			default: 
				return null;
		}
	}

}
