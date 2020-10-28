package task2;

/**
 * 应用
 */
public class Old_Computer implements VGA_Interface {
    public void connectVGA() {
        turnOn();
    }

    private void turnOn() {
        System.out.println("旧笔记本连接成功");
    }

}
