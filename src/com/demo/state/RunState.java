package com.demo.state;

public class RunState extends LiftState {
    @Override
    protected void open() {

    }

    @Override
    protected void close() {

    }

    @Override
    protected void run() {
        System.out.println("RunState.run...");
    }

    @Override
    protected void stop() {
        super.context.setLiftState(Context.stopState);
        super.context.getLiftState().stop();
    }
}
