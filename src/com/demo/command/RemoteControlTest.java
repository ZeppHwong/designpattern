package com.demo.command;


public class RemoteControlTest {
    public static void main(String[] agrs){
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        control.setCommand(0, lightOn, lightOff);


        Door door = new Door();
        DoorOpenCommand doorOpen = new DoorOpenCommand(door);
        DoorCloseCommand doorClose = new DoorCloseCommand(door);
        control.setCommand(1, doorOpen, doorClose);

        System.out.println(control);
        control.onButtonWasPressed(0);
        control.offButtonWasPressed(0);
        control.undoButtonWasPressed();
        control.onButtonWasPressed(1);
        control.offButtonWasPressed(1);
        control.undoButtonWasPressed();
    }
}
