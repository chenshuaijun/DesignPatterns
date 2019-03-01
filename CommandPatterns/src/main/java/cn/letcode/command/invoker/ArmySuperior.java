package cn.letcode.command.invoker;

import cn.letcode.command.Command;

public class ArmySuperior {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void startCommand(){
        command.execute();
    }
}
