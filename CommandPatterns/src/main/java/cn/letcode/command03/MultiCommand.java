package cn.letcode.command03;

import cn.letcode.command03.receiver.ShowMultForm;

public class MultiCommand implements Command {
    ShowMultForm showMultForm;

    public MultiCommand(ShowMultForm showMultForm) {
        this.showMultForm = showMultForm;
    }

    @Override
    public void execute() {
        showMultForm.show();
    }

    @Override
    public String getName() {
        return "显示乘法表";
    }
}
