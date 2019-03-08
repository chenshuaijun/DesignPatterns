package cn.letcode.command04;

import javax.swing.*;
import java.awt.*;

public class Machine extends JFrame {
    Invoke requestOnCamera, requestOffCamera, requestOnLight, requestOffLight;
    Camera camera;
    Light light;

    public Machine() {
        setTitle("小电器");
        requestOnCamera = new Invoke();
        requestOffCamera = new Invoke();
        camera = new Camera();
        requestOnCamera.setCommand(new OnCameraCommand(camera));
        requestOffCamera.setCommand(new OffCameraCommand(camera));
        light = new Light();
        requestOnLight = new Invoke();
        requestOffLight = new Invoke();
        requestOnLight.setCommand(new OnLightCommand(light));
        requestOffLight.setCommand(new OffLightCommand(light));
        initPosition();
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void initPosition() {
        JPanel pSourth = new JPanel();
        pSourth.add(requestOnCamera.getButton());
        pSourth.add(requestOffCamera.getButton());
        pSourth.add(requestOnLight.getButton());
        pSourth.add(requestOffLight.getButton());
        add(pSourth, BorderLayout.SOUTH);

        JPanel pNorth = new JPanel();
        pNorth.add(light);
        add(pNorth, BorderLayout.NORTH);

        JPanel pCenter = new JPanel();
        pCenter.setBackground(Color.yellow);
        pCenter.add(camera);
        add(pCenter, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
//        System.out.println(System.getProperty("user.dir"));
    }
}
