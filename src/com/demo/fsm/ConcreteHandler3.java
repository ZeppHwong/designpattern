package com.demo.fsm;

public class ConcreteHandler3 implements StateHandler {
    @Override
    public void setState(State state) {
        State next = state.nextState();
        System.out.println("ConcreteHandler3.setState :" + next.name());
    }

    @Override
    public void checkCurrentState(State state) {
        if(state.ordinal() != State.Process.ordinal()){
            System.out.println("ConcreteHandler.checkState fail :"+state.name());
        }
    }

    public void run(State state){
        checkCurrentState(state);
        System.out.println("ConcreteHandler3.run:"+state.name());
        setState(state);
    }
}
