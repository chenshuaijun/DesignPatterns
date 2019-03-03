package cn.letcode.command02.invoker;

import cn.letcode.command02.Command;

public class RequestPerson {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void startExecuteCommand() {
        command.execute();
    }
}
