package structural.decorator;

import structural.decorator.impl.Circle;
import structural.decorator.impl.Rectangle;
import structural.decorator.impl.RedShapeDecorator;
/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(rectangle);

        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle with normal border");
        circle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
