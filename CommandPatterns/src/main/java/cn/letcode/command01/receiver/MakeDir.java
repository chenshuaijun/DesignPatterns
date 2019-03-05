package cn.letcode.command01.receiver;

import java.io.File;

/**
 * 创建文件目录接收者
 */
public class MakeDir {
    public void createDir(String dirName) {
        File dir = new File(dirName);
        dir.mkdir();
    }

    public void deleteDir(String dirName) {
        File dir = new File(dirName);
        dir.delete();
    }
}
