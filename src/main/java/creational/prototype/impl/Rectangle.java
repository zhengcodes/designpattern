package creational.prototype.impl;

import creational.prototype.Shape;

public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
