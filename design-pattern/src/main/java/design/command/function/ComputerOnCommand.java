package design.command.function;

import design.command.Command;
import design.command.base.Computer;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName LightCommond.java
 * @Description TODO
 * @createTime 2021年12月01日 15:44:00
 */
public class ComputerOnCommand implements Command {

    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
