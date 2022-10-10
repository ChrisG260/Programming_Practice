package BuilderPattern;

public class BuilderPatternApp {

	/*
	 * Builder pattern builds a complex object using simple objects and using a step by step approach.
	 * A Builder class builds the final object step by step. This builder is independent of other objects.
	 * 
	 */
	public static void main(String[] args) {
		
		/* Interface: Ingredient
		 *		name
		 *      cost
		 * Main Object: Pizza
		 * 		ingredient: Array<Ingredient>
		 * 		addIngredient(Ingredient ingredient)
		 *      getCost()
		 *      addIngredient()
		 * Builder: PizzaBuilder
		 * 		pepperoni
		 * 		meatLovers
		 * 		vegi
		 * Simple classes
		 * 		Bread    implement Ingredient
		 * 			ThinCrust
		 * 			Pan
		 *      Toppings implement Ingredient
		 *      	Sauce    
		 *      	Cheese  
		 *          (Meat) 
		 *      		Pepperoni 
		 *      		Sausge    	
		 *      		Bacon
		 *      	(Vegi)     
		 *      		GreenPeppers 
		 *          	Onions       
		 *          	Tomatoes     
		 *      
		 *      
		 */ 

	}

}
