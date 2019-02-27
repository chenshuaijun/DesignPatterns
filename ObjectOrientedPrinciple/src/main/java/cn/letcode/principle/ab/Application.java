package cn.letcode.principle.ab;

public class Application {
    public static void main(String[] args) {
        A a;
        a = new B();
        int m = a.add(3, 2);
        System.out.println(m);
    }
}
