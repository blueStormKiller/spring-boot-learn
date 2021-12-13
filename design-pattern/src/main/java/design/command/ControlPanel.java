package design.command;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName ControlPanel.java
 * @Description TODO
 * @createTime 2021年12月01日 15:53:00
 */
public class ControlPanel {

    private static final int CONTROL_SIZE = 9;
    private Command[] commands;

    public ControlPanel() {
        commands = new Command[CONTROL_SIZE];
        for (int i = 0; i < CONTROL_SIZE; i++) {
            commands[i] = new NoCommand();
        }
    }

    /**
     * 设置按钮对应命令
     * @param index
     * @param command
     */
    public void setCommand(int index, Command command) {

        commands[index] = command;
    }

    /**
     * 模拟点击按钮
     * @param index
     */
    public void keyPressed(int index) {
        commands[index].execute();
    }
}
