package com.demo.responsibliity;

public class SonHandler extends Handler {

    public SonHandler() {
        super(Handler.SON_LEVEL_REQUSET);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("SonHandler.response" + women.getRequest());
    }
}
