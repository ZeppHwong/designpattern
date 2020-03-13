package com.demo.fsm;

public enum State {
    Init{
        @Override
        public State nextState() {
            return Submit;
        }

        @Override
        public State prevState() {
            return Init;
        }
    },
    Submit{
        @Override
        public State nextState() {
            return Process;
        }

        @Override
        public State prevState() {
            return Init;
        }
    },
    Process{
        @Override
        public State nextState() {
            return Init;
        }

        @Override
        public State prevState() {
            return Submit;
        }
    };
    public abstract State nextState();
    public abstract State prevState();
}
