package BuilderPattern;

import java.util.ArrayList;

public class Pizza {
	
	/*
	 * * Main Object: Pizza
		 * 		ingredient: Array<Ingredient>
		 * 		addIngredient(Ingredient ingredient)
		 *      getCost()
		 *      addIngredient()
	 */

	ArrayList<Ingredient> ingredient = new ArrayList<>();
	
	public void addIngredient(Ingredient ingredient) {
		this.ingredient.add(ingredient);
	}
	
	public float getCost() {
		float result = 0;
		for(Ingredient ing : this.ingredient) {
			result += ing.getCost();
		}
		return result;
	}
	
	
	
}
