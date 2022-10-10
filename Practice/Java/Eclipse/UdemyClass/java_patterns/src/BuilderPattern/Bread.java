package BuilderPattern;

public class Bread implements Ingredient{

	BreadType breadType;
	float cost;
	
	public Bread(BreadType type) {
		this.breadType = type;
		switch (type) {
			case Pan:
				cost = 1.52f;
				break;
			case ThinCrust:
				cost = 1.02f;
				break;
			default:
				cost = 0.0f;
		}
	}
	
	public BreadType getBreadType() {
		return breadType;
	}
	
	
	@Override
	public float getCost() {
		return cost;
	}
	
	

}
