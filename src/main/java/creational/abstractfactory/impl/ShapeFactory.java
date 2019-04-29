package creational.abstractfactory.impl;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Color;
import creational.abstractfactory.Shape;

public class ShapeFactory extends AbstractFactory {

    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
