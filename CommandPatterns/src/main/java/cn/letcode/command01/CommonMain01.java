package cn.letcode.command01;

import cn.letcode.command01.invoker.RequestMakedir;
import cn.letcode.command01.receiver.MakeDir;

public class CommonMain01 {
    public static void main(String[] args){
        MakeDir makeDir = new MakeDir();
        Command command = new ConcreteCommand(makeDir);

        RequestMakedir requestMakedir = new RequestMakedir();
        requestMakedir.setCommand(command);

        requestMakedir.startCommand("test1.file");
        requestMakedir.startCommand("test2.file");
        requestMakedir.startCommand("test3.file");

        requestMakedir.undoCommand();
        requestMakedir.undoCommand();
    }
}
