package creational.abstractfactory.impl;

import creational.abstractfactory.Shape;

public class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
