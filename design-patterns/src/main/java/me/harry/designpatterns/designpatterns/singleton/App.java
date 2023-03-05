package me.harry.designpatterns.designpatterns.singleton;

public class App {

    public static void main(String[] args) {

        /*
        * 새로운 인스턴스를 여러개 만들 수 있고, 이는 다른 주소를 가지므로 다른 객체이다.
        Settings settings1 = new Settings();
        Settings settings2 = new Settings();
        */

        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1 == settings2);
    }
}
