package design.command;

import design.command.base.Computer;
import design.command.base.Door;
import design.command.base.Light;
import design.command.function.*;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年12月01日 16:07:00
 */
public class Test {
    public static void main(String[] ages) {
        /**
         * 三个家电
         */
        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();

        /**
         * 控制器
         */
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setCommand(0, new LightOnCommand(light));
        controlPanel.setCommand(1, new LightOffCommand(light));
        controlPanel.setCommand(2, new ComputerOnCommand(computer));
        controlPanel.setCommand(3, new ComputerOffCommand(computer));
        controlPanel.setCommand(4, new DoorOpenCommand(door));
        controlPanel.setCommand(5, new DoorCloseCommand(door));

        // 模拟点击
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(5);
        controlPanel.keyPressed(8);
        // 这个没有指定，但是不会出任何问题，我们的NoCommand的功劳

        // 定义一键搞定模式
        QuickCommand quickCommand = new QuickCommand(new Command[]{new DoorCloseCommand(door),
                new LightOffCommand(light), new ComputerOnCommand(computer)});
        System.out.println("****点击一键搞定按钮****");
        controlPanel.setCommand(8, quickCommand);
        controlPanel.keyPressed(8);
    }
}
