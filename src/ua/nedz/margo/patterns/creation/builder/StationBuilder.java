package ua.nedz.margo.patterns.creation.builder;

public class StationBuilder implements Builder {
    @Override
    public void buildPart() {
        System.out.println("Station built!");
    }
}
