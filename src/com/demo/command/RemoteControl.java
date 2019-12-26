package com.demo.command;

import java.util.Arrays;

public class RemoteControl {
    /**
     * 一个插槽持有命令 , 一个命令控制一个装置
     */
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", undoCommand=" + undoCommand +
                '}';
    }

    /**
     * 初始化 命令列表
     */
    public RemoteControl(){
        onCommands = new Command[10];
        offCommands = new Command[10];
        Command noCommand = new NoCommand();
        for (int i=0; i<10; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * 用来设置插槽的命令， 可以多次修改遥控器按钮行为
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int slot , Command onCommand,Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    /**
     *  按下按钮 方法会被调用 
     */
    public void onButtonWasPressed(int slot){
        this.onCommands[slot].execute();
        undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        this.offCommands[slot].execute();
        undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

}
