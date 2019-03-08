package cn.letcode.command04;

public class OnCameraCommand implements Command {
    Camera camera;

    public OnCameraCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.on();
    }

    @Override
    public String getName() {
        return "打开摄像头";
    }
}
