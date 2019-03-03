package cn.letcode.command02;

import java.util.ArrayList;

public class MacroCommand implements Command {
    ArrayList<Command> commandList;

    MacroCommand(ArrayList<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        int size = commandList.size();
        for (int k = 0; k < size; k++) {
            Command command = commandList.get(k);
            command.execute();
        }
    }
}
