package com.demo.fsm;

public interface StateHandler {
    void setState(State state);
    void checkCurrentState(State state);
}
