package me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.after;

import me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.before.Request;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if( nextHandler != null ) {
            nextHandler.handle(request);
        }
    }
}
