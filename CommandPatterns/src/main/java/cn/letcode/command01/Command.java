package cn.letcode.command01;

/**
 * 文件创建命令
 */
public interface Command {
    public abstract void execute(String dirName);

    public abstract void undo();
}
