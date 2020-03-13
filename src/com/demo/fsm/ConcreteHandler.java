package com.demo.fsm;

public class ConcreteHandler implements StateHandler {
    @Override
    public void setState(State state) {
        State next = state.nextState();
        System.out.println("ConcreteHandler.setState :" + next.name());
    }

    @Override
    public void checkCurrentState(State state) {
        if(state.ordinal() != State.Init.ordinal()){
            System.out.println("ConcreteHandler.checkState fail:"+state.name());
        }
    }

    public void run(State state){
        checkCurrentState(state);
        System.out.println("ConcreteHandler.run:"+state.name());
        setState(state);
    }
}
