package cn.letcode.principle.abstracts;

public class Pillar {
    Geometry bottom;  // 使用抽象类来定义底部面积
    double height;

    Pillar(Geometry bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolume() {
        return bottom.getArea() * height;
    }
}
