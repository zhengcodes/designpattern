package creational.factory.impl;

import creational.factory.Shape;

public class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}