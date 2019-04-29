package creational.abstractfactory.impl;

import creational.abstractfactory.Shape;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
