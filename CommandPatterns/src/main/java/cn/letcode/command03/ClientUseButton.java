package cn.letcode.command03;

import cn.letcode.command03.invoker.Invoker;
import cn.letcode.command03.receiver.ShowMultForm;

import javax.swing.*;
import java.awt.*;

public class ClientUseButton  extends JFrame {
    JButton button;
    Command command;
    Invoker person;
    public ClientUseButton(){
        person = new Invoker();
        command = new MultiCommand(new ShowMultForm());
        person.setCommand(command);

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        button=person.getButton();
        frame.add(button);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setCommand(Command command) {
        this.command = command;
    }


    public static void main(String[] args){
        ClientUseButton win = new ClientUseButton();
    }
}
