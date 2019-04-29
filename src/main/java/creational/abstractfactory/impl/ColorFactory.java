package creational.abstractfactory.impl;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Color;
import creational.abstractfactory.Shape;

public class ColorFactory extends AbstractFactory {

    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String shapeType) {
        return null;
    }
}
