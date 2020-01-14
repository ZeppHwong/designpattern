package com.demo.state;

public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    protected abstract void open();
    protected abstract void close();
    protected abstract void run();
    protected abstract void stop();
}
