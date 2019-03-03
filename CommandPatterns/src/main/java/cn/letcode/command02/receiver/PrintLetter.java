package cn.letcode.command02.receiver;

public class PrintLetter {
    public void printEnglish() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void printRussian() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
