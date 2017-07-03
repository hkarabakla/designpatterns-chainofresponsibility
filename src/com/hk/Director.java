package com.hk;

/**
 * Created by huseyin karabakla on 03.07.2017.
 */
public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {

        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve Conference requests !");
        } else {
            getSuccessor().handleRequest(request);
        }
    }
}
