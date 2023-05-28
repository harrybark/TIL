package me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.after;

import me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.before.Request;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
