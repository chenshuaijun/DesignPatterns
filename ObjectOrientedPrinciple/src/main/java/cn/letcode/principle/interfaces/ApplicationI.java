package cn.letcode.principle.interfaces;

public class ApplicationI {
    public static void main(String[] args) {
        Com com;
        com = new ComImp(); // com变量存放ComImp 类的对象引用
        int m = com.sub(8, 2);
        System.out.println(m);
    }
}
