package design.command.function;

import design.command.Command;
import design.command.base.Door;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName LightCommond.java
 * @Description TODO
 * @createTime 2021年12月01日 15:44:00
 */
public class DoorCloseCommand implements Command {

    private Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
