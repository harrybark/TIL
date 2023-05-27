package me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
