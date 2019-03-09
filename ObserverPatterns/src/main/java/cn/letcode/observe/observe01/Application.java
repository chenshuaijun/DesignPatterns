package cn.letcode.observe.observe01;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        SeekJobCenter center = new SeekJobCenter();
        String path = System.getProperty("user.dir") + File.separator + "ObserverPatterns" + File.separator;
        UniversityStudent student = new UniversityStudent(center, path + "file1.txt");
        HaiGui haiGui = new HaiGui(center, path + "file2.txt");

        center.giveNewMess("开科公司需要10名Java软件工程师");
        center.notifyObserver();

        center.giveNewMess("开科需要两名前台");
        center.notifyObserver();

    }
}
