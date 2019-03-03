package cn.letcode.command02;

import cn.letcode.command02.receiver.PrintNumber;

public class PrintEvenNumberCommand  implements Command{
    PrintNumber number;
    PrintEvenNumberCommand(PrintNumber number){
        this.number = number;
    }
    @Override
    public void execute() {
        number.printEvenNumber();
    }
}
