package task2;

/**
 * 应用
 */
public class Application {
    public static void main(String[] args) {
        New_Computer new_computer=new New_Computer();
        turnOn(new_computer);
        Old_Computer old_computer=new Old_Computer();
        HDMI_Interface_IMPL hdmi_interface_impl=new HDMI_Interface_IMPL(old_computer);
        turnOn(hdmi_interface_impl);

    }

    private static void turnOn(HDMI_Interface hi) {
        hi.connectHDMI();
    }
}
