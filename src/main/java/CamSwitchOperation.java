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
