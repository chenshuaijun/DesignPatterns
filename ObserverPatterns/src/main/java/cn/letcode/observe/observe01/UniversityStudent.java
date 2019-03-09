package cn.letcode.observe.observe01;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UniversityStudent implements Observer {
    Subject subject;
    File myFile;

    public UniversityStudent(Subject subject, String fileName) {
        this.subject = subject;
        this.subject.addObserver(this);
        myFile = new File(fileName);
    }


    @Override
    public void hearTelephone(String heardMess) {
        try {
            RandomAccessFile out = new RandomAccessFile(myFile, "rw");
            out.seek(out.length());
            byte[] b = heardMess.getBytes("utf-8");
            out.write(b);
            System.out.println("我是大学生");
            System.out.println("我向文件" + myFile.getName() + "中写了以下内容：" + heardMess);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
