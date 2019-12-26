package com.demo.command;


/**
 * 创建命令对象
 */
public class DoorOpenCommand implements Command {
    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
