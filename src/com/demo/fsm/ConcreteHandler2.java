package com.demo.fsm;

public class ConcreteHandler2 implements StateHandler {
    @Override
    public void setState(State state) {
        State next = state.nextState();
        System.out.println("ConcreteHandler2.setState :" + next.name());
    }

    @Override
    public void checkCurrentState(State state) {
        if(state.ordinal() != State.Submit.ordinal()){
            System.out.println("ConcreteHandler.checkState fail:"+state.name());
        }
    }

    public void run(State state){
        checkCurrentState(state);
        System.out.println("ConcreteHandler2.run:"+state.name());
        setState(state);
    }
}
