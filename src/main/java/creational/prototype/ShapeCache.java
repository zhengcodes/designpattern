package creational.prototype;

import creational.prototype.impl.Rectangle;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        if(cachedShape==null){
            return null;
        }
        return  (Shape)cachedShape.clone();



    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
