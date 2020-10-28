package task2;

public class New_Computer implements HDMI_Interface {

    public void connectHDMI() {
        turnOn();
    }
    public void turnOn(){
        System.out.println("新笔记本连接成功");
    }
}
