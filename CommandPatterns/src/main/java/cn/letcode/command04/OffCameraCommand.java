package cn.letcode.command04;

public class OffCameraCommand implements Command {

    Camera camera;

    public OffCameraCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.off();
    }

    @Override
    public String getName() {
        return "关闭摄像头";
    }
}
