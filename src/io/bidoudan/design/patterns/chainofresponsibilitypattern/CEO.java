package io.bidoudan.design.patterns.chainofresponsibilitypattern;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want...");
    }
}
