package cn.letcode.command;

import cn.letcode.command.receiver.CompanyArmy;

/**
 * 定义具体要执行的命令
 */
public class ConcreteCommand implements Command {
    CompanyArmy army;  // 对于接收者的引用

    ConcreteCommand(CompanyArmy army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.sneakAttack();
    }
}
