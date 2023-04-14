package com.example._2023practice.Designpattern.STRUCTURAL.bridge;
/*
 * @author KK JavaTutorials
 *Concrete implementation of Color
 */
public class Blue implements Color {
   
	@Override
    public String fill() {
        return "Color is Blue";
    }
}