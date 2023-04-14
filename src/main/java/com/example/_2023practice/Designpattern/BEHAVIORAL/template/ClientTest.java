package com.example._2023practice.Designpattern.BEHAVIORAL.template;

/**
 * @author KK JavaTutorials
 *This is Client program for Template design Pattern
 */
public class ClientTest {

	public static void main(String[] args) {
		
		PizzaTemplate pizzaTemplate = new VegPizza();
		pizzaTemplate.preparePizza();
		
		System.out.println("----------------------------------");
		
		pizzaTemplate = new NonVegPizza();
		pizzaTemplate.preparePizza();


		System.out.println("---------------");

		PaymentFlow pr=new AmexImpl();
pr.callDS("TRY");
		System.out.println("**");
		pr.callDS("LIVE");

		System.out.println("**");
		PaymentFlow pr1=new VisaImpl();
		pr1.callDS("TRY");

		pr1.callDS("LIVE");


	}

}