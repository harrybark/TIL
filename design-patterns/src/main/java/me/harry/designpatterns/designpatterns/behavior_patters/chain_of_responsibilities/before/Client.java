package me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler = new AuthRequestHandler();
        requestHandler.handler(request);
    }
}
