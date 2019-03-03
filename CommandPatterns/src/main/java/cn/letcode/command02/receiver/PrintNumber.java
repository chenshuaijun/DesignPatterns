package cn.letcode.command02.receiver;

public class PrintNumber {
    int n;

    public PrintNumber(int n) {
        this.n = n;
    }

    public void printEvenNumber() {
        for (int m = 1; m <= n; m++) {
            if (m % 2 == 0) {
                System.out.print(m + "  ");
            }
        }
        System.out.println();
    }
}
