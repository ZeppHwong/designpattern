package com.demo.responsibliity;

public class HusBandHandler extends Handler {


    public HusBandHandler() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("HusBandHandler.response" + women.getRequest());
    }
}
