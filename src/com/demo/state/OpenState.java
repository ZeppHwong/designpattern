package com.demo.state;

/**
 * @author cadde
 */
public class OpenState extends LiftState {

    @Override
    protected void open() {
        System.out.println("OpenState.open...");
    }

    @Override
    protected void close() {
        super.context.setLiftState(Context.closeState);
        super.context.getLiftState().close();
    }

    @Override
    protected void run() {

    }

    @Override
    protected void stop() {

    }
}
