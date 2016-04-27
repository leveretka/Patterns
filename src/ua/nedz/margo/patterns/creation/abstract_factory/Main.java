package ua.nedz.margo.patterns.creation.abstract_factory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory factory1 = new WhiteFactory();
        AbstractFactory factory2 = new BlackFactory();

        factory1.createCircle().draw();
        factory1.createRectangle().draw();
        factory1.createSquare().draw();

        factory2.createSquare().draw();
        factory2.createRectangle().draw();
        factory2.createCircle().draw();

    }
}
