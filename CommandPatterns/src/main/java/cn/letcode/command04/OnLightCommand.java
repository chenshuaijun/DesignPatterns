package cn.letcode.command04;

public class OnLightCommand implements Command {
    Light light;

    public OnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public String getName() {
        return "打开照明灯";
    }
}
