package cn.letcode.command01.invoker;

import cn.letcode.command01.Command;

public class RequestMakedir {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void startCommand(String dirName) {
        command.execute(dirName);
    }

    public void undoCommand() {
        command.undo();
    }
}
