package com.demo.responsibliity;

public class FatherHandler extends Handler {
    public FatherHandler(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println("FatherHandler.response" + women.getRequest());
    }
}
