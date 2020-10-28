package task2;

/**
 * 适配器
 */
public class HDMI_Interface_IMPL implements HDMI_Interface {
    VGA_Interface vga_interface;
    HDMI_Interface_IMPL(VGA_Interface vga_interface){
        this.vga_interface=vga_interface;
    }
    public void connectHDMI() {
        vga_interface.connectVGA();
    }
}
