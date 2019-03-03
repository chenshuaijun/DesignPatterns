package cn.letcode.command02;

import cn.letcode.command02.invoker.RequestPerson;
import cn.letcode.command02.receiver.PrintLetter;
import cn.letcode.command02.receiver.PrintNumber;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Command> list = new ArrayList<>();
        RequestPerson person = new RequestPerson();

        Command command1 = new PrintEnglishCommand(new PrintLetter());
        Command command2 = new PrintRussianCommand(new PrintLetter());
        Command command3 = new PrintEvenNumberCommand(new PrintNumber(20));


        list.add(command1);
        list.add(command2);
        list.add(command3);

        Command macroCommand = new MacroCommand(list);

        System.out.println("单独输出英文字母");
        person.setCommand(command1);
        person.startExecuteCommand();
        System.out.println("用宏命令打印字符");
        person.setCommand(macroCommand);
        person.startExecuteCommand();


    }
}
