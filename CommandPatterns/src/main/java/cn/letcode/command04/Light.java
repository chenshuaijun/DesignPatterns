package cn.letcode.command04;

import javax.swing.*;

public class Light extends JPanel {
    String name;
    Icon imageIcon;
    JLabel label;

    public Light() {
        label = new JLabel("我是照明灯");
        add(label);
    }
    public void on(){
        label.setIcon(new ImageIcon("icon/open-02.png"));
    }
}
