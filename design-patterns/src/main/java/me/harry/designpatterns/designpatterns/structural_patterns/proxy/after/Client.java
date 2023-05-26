package me.harry.designpatterns.designpatterns.structural_patterns.proxy.after;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
