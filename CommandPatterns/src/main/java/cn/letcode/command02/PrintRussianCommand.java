package cn.letcode.command02;

import cn.letcode.command02.receiver.PrintLetter;

public class PrintRussianCommand implements Command {
    PrintLetter letter;

    PrintRussianCommand(PrintLetter letter) {
        this.letter = letter;
    }


    @Override
    public void execute() {
        letter.printRussian();
    }
}
