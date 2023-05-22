package me.harry.designpatterns.designpatterns.structural_patterns.composite.after;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.getPrice(doranBlade);
        client.getPrice(bag);
    }

    private void getPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
