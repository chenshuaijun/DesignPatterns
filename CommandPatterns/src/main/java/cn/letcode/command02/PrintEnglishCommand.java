package cn.letcode.command02;

import cn.letcode.command02.receiver.PrintLetter;

public class PrintEnglishCommand implements Command {
    PrintLetter letter;

    PrintEnglishCommand(PrintLetter letter) {
        this.letter = letter;
    }

    @Override
    public void execute() {
        letter.printEnglish();
    }
}
