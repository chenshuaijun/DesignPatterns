package cn.letcode.command03.invoker;

import cn.letcode.command03.Command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Invoker {
    JButton button;
    Command command;

    public Invoker() {
        button = new JButton();
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        executeCommand();
                    }
                }
        );
    }

    public void setCommand(Command command) {
        this.command = command;
        button.setName(command.getName());
    }

    public JButton getButton() {
        return button;
    }

    public void executeCommand() {
        command.execute();
    }
}
