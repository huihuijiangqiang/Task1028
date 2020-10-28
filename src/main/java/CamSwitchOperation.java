/**
 * 摄像头操作者:控制摄像头开关
 */
public class CamSwitchOperation {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }


    public void OpenCam(){
        command.OpenSwitch();
    }
    public void CloseCam(){
        command.CloseSwitch();
    }
}
