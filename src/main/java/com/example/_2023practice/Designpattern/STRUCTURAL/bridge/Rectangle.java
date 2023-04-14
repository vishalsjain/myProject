package com.example._2023practice.Designpattern.STRUCTURAL.bridge;

/**
 * @author KK JavaTutorials
 *Concrete implementation of Shape
 */
public class Rectangle extends Shape {
	
    public Rectangle(Color color) {
        super(color);
    }
 
    @Override
    public String draw() {
        return "Rectangle drawn " + color.fill();
    }
}