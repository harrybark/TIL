package me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.after;

import me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
