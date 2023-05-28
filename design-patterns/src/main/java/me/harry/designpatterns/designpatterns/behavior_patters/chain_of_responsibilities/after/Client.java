package me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.after;

import me.harry.designpatterns.designpatterns.behavior_patters.chain_of_responsibilities.before.Request;

public class Client {

    private RequestHandler requestHandler ;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기.");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
