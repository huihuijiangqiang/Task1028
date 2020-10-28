/**
 * 灯开关开关实现
 */
public class Command_Light_IPML implements  Command {
    Group_Light_Switch ls;
    public Command_Light_IPML(Group_Light_Switch ls){
        this.ls=ls;
    }
    public void OpenSwitch() {
        ls.OpenLight();
    }

    public void CloseSwitch() {
        ls.CloseLight();
    }
}
