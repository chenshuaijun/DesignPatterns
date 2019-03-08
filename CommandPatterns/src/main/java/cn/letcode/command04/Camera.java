package cn.letcode.command04;

import javax.swing.*;
import java.io.File;

public class Camera extends JPanel {
    String name;
    Icon imageIcon;
    JLabel label;

    public Camera() {
        label = new JLabel("我是摄像头");
        label.setIcon(new ImageIcon(""));
        add(label);
    }

    public void on() {
        label.setIcon(new ImageIcon(ConfigConstants.path + File.separator + "camera-open.png"));
    }

    public void off() {
        label.setIcon(new ImageIcon(ConfigConstants.path + File.separator + "camera-close.png"));
    }
}
