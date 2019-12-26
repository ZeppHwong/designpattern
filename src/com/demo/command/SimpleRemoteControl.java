package com.demo.command;

public class SimpleRemoteControl {
    /**
     * 一个插槽持有命令 , 一个命令控制一个装置
     */
    private Command slot;

    public SimpleRemoteControl(){

    }

    /**
     * 用来设置插槽的命令， 可以多次修改遥控器按钮行为
     * @param command
     */
    public void setCommand(Command command){
        slot = command;
    }

    /**
     *  按下按钮 方法会被调用
     */
    public void buttonWasPressed(){
        slot.execute();
    }

}
