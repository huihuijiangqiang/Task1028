package task1;

public class Application {
    public static void main(String[] args) {
        //摄像头开关
        Group_Cam_Switch cs=new Group_Cam_Switch();
        Command command=new Command_Cam_IPML(cs);

        //灯开关操作
        Group_Light_Switch ls=new Group_Light_Switch();
        Command command1=new Command_Light_IPML(ls);

        //摄像头开关操作者
        CamSwitchOperation camSwitchOperation=new CamSwitchOperation();
        camSwitchOperation.setCommand(command);
        camSwitchOperation.OpenCam();
        camSwitchOperation.CloseCam();

        //灯开关操作
        LightSwitchOperation lightSwitchOperation=new LightSwitchOperation();
        lightSwitchOperation.setCommand(command1);
        lightSwitchOperation.OpenCam();
        lightSwitchOperation.CloseCam();


    }
}
