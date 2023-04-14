package com.example._2023practice.Designpattern.STRUCTURAL.bridge;

/**
 * @author KK JavaTutorials
 * This class establishes bridge between Shape and Color
 */
public class Square extends Shape {
	
    public Square(Color color) {
        super(color);
    }
 
    @Override
    public String draw() {
        return "Square drawn " + color.fill();
    }
}