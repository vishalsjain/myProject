package com.example._2023practice.Designpattern.STRUCTURAL.bridge;

/**
 * @author KK JavaTutorials
 *Contract for Shape
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String draw();
}