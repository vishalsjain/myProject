package com.example._2023practice.Designpattern.BEHAVIORAL.template;
/**
 * @author KK JavaTutorials
 * This class is the one of implementation of Template
 * Responsible to cook Veg Pizza
 */
public class VegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for Veg-Pizza!!");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding ingredients in Veg-Pizza!!");
	}
}