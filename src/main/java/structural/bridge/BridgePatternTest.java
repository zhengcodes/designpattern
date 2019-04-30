package structural.bridge;

import structural.bridge.impl.Circle;
import structural.bridge.impl.GreenCircle;
import structural.bridge.impl.RedCircle;

public class BridgePatternTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
