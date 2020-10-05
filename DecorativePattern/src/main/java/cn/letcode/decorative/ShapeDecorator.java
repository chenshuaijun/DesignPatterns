package cn.letcode.decorative;

/**
 * 形状的装饰类
 * @author chenshuaijun
 * @since 20201005
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}