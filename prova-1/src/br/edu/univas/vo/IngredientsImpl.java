package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class IngredientsImpl implements Ingredients{
	
	private List<Ingredients> ingredients;
	
	public IngredientsImpl() {
		ingredients = new ArrayList<>();
	}

	@Override
	public String description() {
		String returnIngredient = "";
		
		for (Ingredients ingredient:ingredients) {
			returnIngredient += ingredient.description() + ' ';
        }
        return returnIngredient;
	}

	@Override
	public double price() {
		double total = 0;
		for(Ingredients ingredient:ingredients){
			total += ingredient.price();
		}
		return total;
	}
	
	public void addIngredients(Ingredients ingredient) {
		ingredients.add(ingredient);
	}
	
	public void removeIngredients(Ingredients ingredient) {
        ingredients.remove(ingredient);
    }

}
