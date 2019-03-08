package cn.letcode.command04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Invoke {
    JButton button;
    Command command;

    Invoke() {
        button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand();
            }
        });
    }

    public void executeCommand() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
        this.button.setText(command.getName());
    }

    public JButton getButton() {
        return button;
    }
}
