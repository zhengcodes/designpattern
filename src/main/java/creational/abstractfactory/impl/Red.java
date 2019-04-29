package creational.abstractfactory.impl;

import creational.abstractfactory.Color;

public class Red implements Color {
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
