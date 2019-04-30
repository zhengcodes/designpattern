package creational.prototype;

public class PrototypePatternTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
