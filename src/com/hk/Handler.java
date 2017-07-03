package com.hk;

/**
 * Created by huseyin karabakla on 03.07.2017.
 */
public abstract class Handler {

    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
