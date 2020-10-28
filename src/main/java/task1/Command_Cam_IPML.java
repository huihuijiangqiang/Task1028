package task1;

/**
 * 摄像头开关接口实现
 */
public class Command_Cam_IPML implements  Command {
    Group_Cam_Switch cs;
    public Command_Cam_IPML( Group_Cam_Switch cs){
        this.cs=cs;
    }
    public void OpenSwitch() {
        cs.OpenCam();
    }

    public void CloseSwitch() {
        cs.CloseCam();
    }

}
