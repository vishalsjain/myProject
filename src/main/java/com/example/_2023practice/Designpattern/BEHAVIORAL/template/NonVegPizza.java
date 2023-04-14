package com.example._2023practice.Designpattern.BEHAVIORAL.template;
/**
 * @author KK JavaTutorials
 *This class is the one of implementation of Template
 *Responsible to cook NonVeg Pizza
 */
public class NonVegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for NonVeg-Pizza!!");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding ingredients in NonVeg-Pizza!!");
	}
}