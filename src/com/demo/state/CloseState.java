package com.demo.state;

/**
 * @author cadde
 */
public class CloseState extends LiftState {
    @Override
    protected void open() {
        super.context.setLiftState(Context.openState);
        super.context.getLiftState().open();
    }

    @Override
    protected void close() {
        System.out.println("CloseState.close...");
    }

    @Override
    protected void run() {
        super.context.setLiftState(Context.runState);
        super.context.getLiftState().run();
    }

    @Override
    protected void stop() {
        super.context.setLiftState(Context.stopState);
        super.context.getLiftState().stop();
    }
}
