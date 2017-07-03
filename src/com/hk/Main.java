package com.hk;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        VicePresident vP = new VicePresident();
        Ceo ceo = new Ceo();

        director.setSuccessor(vP);
        vP.setSuccessor(ceo);

        Request request1 = new Request(RequestType.CONFERENCE, 0);
        director.handleRequest(request1);

        Request request2 = new Request(RequestType.PAYMENT, 1300);
        director.handleRequest(request2);

        Request request3 = new Request(RequestType.PAYMENT, 2000);
        director.handleRequest(request3);
    }
}
