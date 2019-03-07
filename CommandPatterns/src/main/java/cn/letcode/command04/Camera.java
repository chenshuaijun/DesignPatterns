package cn.letcode.command04;

import javax.swing.*;

public class Camera extends JPanel {
    String name;
    Icon imageIcon;
    JLabel label;

    public Camera() {
        label = new JLabel("我是摄像头");
        add(label);
    }

    public void on() {
        label.setIcon(new ImageIcon("icon/open-01.png"));
    }

    public void off() {
        label.setIcon(new ImageIcon("icon/open-02.png"));
    }
}
