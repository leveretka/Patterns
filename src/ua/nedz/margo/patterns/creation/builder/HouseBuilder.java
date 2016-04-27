package ua.nedz.margo.patterns.creation.builder;

public class HouseBuilder implements Builder{
    @Override
    public void buildPart() {
        System.out.println("House built!");
    }
}
