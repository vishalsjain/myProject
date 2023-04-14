package com.example._2023practice.Designpattern.STRUCTURAL.bridge;


/**
 * @author KK JavaTutorials
 *Client program which uses Bridge pattern
 */
public class ClientTest {

	public static void main(String[] args) {
	
		Shape square = new Square(new Blue());
		String blueSquare = square.draw();
		System.out.println(blueSquare);
		
		System.out.println("============================================");
		
		Shape shape =  new Rectangle(new Red());
		String redRectangle = shape.draw();
		System.out.println(redRectangle);
	}

}