package cn.letcode.command03.receiver;

public class ShowMultForm {
    public void show() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
