package cn.letcode.observe.observe01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class HaiGui implements Observer {
    Subject subject;
    File myFile;

    public HaiGui(Subject subject, String fileName) {
        this.subject = subject;
        this.subject.addObserver(this);
        this.myFile = new File(fileName);
    }

    @Override
    public void hearTelephone(String heardMess) {
        try {
            boolean boo = heardMess.contains("java 程序员") || heardMess.contains("软件");
            if (boo) {
                RandomAccessFile out = new RandomAccessFile(myFile, "rw");
                out.seek(out.length());
                byte[] b = heardMess.getBytes("utf-8");
                out.write(b);
                System.out.println("我是一名海归");
                System.out.println("我向文件：" + myFile.getName() + "中写下了内容如下：" + heardMess);
            } else {
                System.out.println("我是一名海归，这次的信息中没有我需要的信息！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
