package com.demo.command;


public class SimpleRemoteControlTest {
    public static void main(String[] agrs){
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        control.setCommand(lightOn);
        control.buttonWasPressed();
        Door door = new Door();
        DoorOpenCommand doorOpen = new DoorOpenCommand(door);
        control.setCommand(doorOpen);
        control.buttonWasPressed();
    }
}
