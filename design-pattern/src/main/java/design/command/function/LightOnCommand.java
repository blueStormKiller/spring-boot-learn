package design.command.function;

import design.command.Command;
import design.command.base.Light;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName LightCommond.java
 * @Description TODO
 * @createTime 2021年12月01日 15:44:00
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
