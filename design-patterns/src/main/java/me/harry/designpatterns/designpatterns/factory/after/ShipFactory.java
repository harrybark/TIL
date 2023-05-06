package me.harry.designpatterns.designpatterns.factory.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    private void validate(String name, String email) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is null");
        }
        if(email == null || email.isBlank()) {
            throw new IllegalArgumentException("email is null");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    void sendEmailTo(String email, Ship ship) ;
}
