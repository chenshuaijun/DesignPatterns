package cn.letcode.principle.abstracts;

public class ApplicationAB {
    public static void main(String[] args) {
        Pillar pillar;
        Geometry bottom;
        bottom = new Rectangle(22, 33);
        pillar = new Pillar(bottom, 40);
        System.out.println("矩形底的柱体体积是：" + pillar.getVolume());

        bottom = new Circle(30);
        pillar = new Pillar(bottom, 40);
        System.out.println("圆形底的柱体的体积是：" + pillar.getVolume());
    }
}
