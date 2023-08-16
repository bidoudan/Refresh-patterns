package io.bidoudan.design.patterns.chainofresponsibilitypattern;

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
       Director bryan = new Director();
       VP crystal = new VP();
       CEO jef = new CEO();

       bryan.setSuccessor(crystal);
       crystal.setSuccessor(jef);

       Request request = new Request(RequestType.CONFERENCE, 500);
       bryan.handleRequest(request);

       request = new Request(RequestType.PURCHASE, 1000);
       bryan.handleRequest(request);

       request = new Request(RequestType.PURCHASE, 2000);
       bryan.handleRequest(request);

    }
}