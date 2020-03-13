package com.demo.fsm;

public class Test {
    public static void main(String[] args) {
        State state = State.Init;
        ConcreteHandler handler1 = new ConcreteHandler();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        ConcreteHandler3 handler3 = new ConcreteHandler3();
        handler1.run(state);
        state = State.Submit;
        handler2.run(state);
        state = State.Process;
        handler3.run(state);
        state = State.Init;
        handler1.run(state);
    }
}
