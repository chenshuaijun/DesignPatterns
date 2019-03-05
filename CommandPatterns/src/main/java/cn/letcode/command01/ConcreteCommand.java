package cn.letcode.command01;

import cn.letcode.command01.receiver.MakeDir;

import java.util.ArrayList;

public class ConcreteCommand implements Command {
    ArrayList<String> dirNameList;
    MakeDir makeDir;

    ConcreteCommand(MakeDir makeDir) {
        this.dirNameList = new ArrayList<>();
        this.makeDir = makeDir;
    }

    @Override
    public void execute(String dirName) {
        makeDir.createDir(dirName);
        dirNameList.add(dirName);
    }

    @Override
    public void undo() {
        if (dirNameList.size() > 0) {
            int m = dirNameList.size();
            String str = dirNameList.get(m - 1);
            makeDir.deleteDir(str);
            dirNameList.remove(m - 1);
        }else {
            System.out.println("没有可以撤销的操作了！！");
        }

    }
}
