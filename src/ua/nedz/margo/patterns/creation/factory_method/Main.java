package ua.nedz.margo.patterns.creation.factory_method;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.createShape(ShapeName.RECTANGLE).draw();
        creator.createShape(ShapeName.CIRCLE).draw();
        creator.createShape(ShapeName.SQUARE).draw();
    }
}
