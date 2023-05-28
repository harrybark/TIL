package me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.after;

import me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.before.Request;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
