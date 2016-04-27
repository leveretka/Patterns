package ua.nedz.margo.patterns.creation.prototype;

public class Main {

    public static void main(String[] args) {
        PrototypeFactory factory = new PrototypeFactory();

        factory.createInfantryman().info();
        factory.createArcher().info();
    }
}
