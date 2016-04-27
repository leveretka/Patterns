package ua.nedz.margo.patterns.creation.builder;

public class Main {

    public static void main (String[] args) {
        Director director1 = new Director(new HouseBuilder());
        Director director2 = new Director(new StationBuilder());

        director1.construct();
        director2.construct();
    }
}
