package com.demo.state;

public class StopState extends LiftState {
    @Override
    protected void open() {
        super.context.setLiftState(Context.openState);
        super.context.getLiftState().open();
    }

    @Override
    protected void close() {

    }

    @Override
    protected void run() {
        super.context.setLiftState(Context.runState);
        super.context.getLiftState().run();
    }

    @Override
    protected void stop() {
        System.out.println("StopState.stop...");
    }
}
