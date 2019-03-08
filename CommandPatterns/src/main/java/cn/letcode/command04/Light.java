package cn.letcode.command04;

import javax.swing.*;
import java.io.File;

public class Light extends JPanel {
    String name;
    Icon imageIcon;
    JLabel label;

    public Light() {
        label = new JLabel("我是照明灯");
        add(label);
    }

    public void on() {
        label.setIcon(new ImageIcon(ConfigConstants.path + File.separator + "light-open.png"));
    }

    public void off() {
        label.setIcon(new ImageIcon(ConfigConstants.path + File.separator + "light-close.png"));
    }
}
