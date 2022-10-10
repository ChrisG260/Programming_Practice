package AbstractFactoryMethod;

public class BoatFactory extends AbstractVehicleFactory {

	@Override
	Vehicle create(VehicleModel model) {
		
		switch(model) {
			case Ski_Fish: 
				return new Ski_Fish();
			default: 
				return null;
		}
	}

}
