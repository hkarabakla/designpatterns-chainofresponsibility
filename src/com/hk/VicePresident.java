package com.hk;

/**
 * Created by huseyin karabakla on 03.07.2017.
 */
public class VicePresident extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PAYMENT && request.getAmount() < 1500) {
            System.out.println("Vice President can approve Payment requests less than 1500 !");
        } else {
            getSuccessor().handleRequest(request);
        }
    }
}
