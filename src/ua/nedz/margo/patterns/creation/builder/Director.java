package ua.nedz.margo.patterns.creation.builder;

public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart();
    }
}
