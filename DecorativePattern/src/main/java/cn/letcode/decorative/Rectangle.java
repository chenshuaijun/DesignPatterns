package cn.letcode.decorative;

/**
 * 实现的实例，被装饰处理的类 （长方形）
 *
 * @author chenshuaijun
 * @since 20201005
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}