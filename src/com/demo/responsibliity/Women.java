package com.demo.responsibliity;

public class Women implements IWomen {
    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = " type :" + type + " :" +request;
                break;
            case 2:
                this.request = " type :" + type + " :" +request;
                break;
            case 3:
                this.request = " type :" + type + " :" +request;
                break;
             default:
                 break;
        }

    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
