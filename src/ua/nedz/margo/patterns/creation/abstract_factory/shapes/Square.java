package ua.nedz.margo.patterns.creation.abstract_factory.shapes;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + getColor() + " Square::draw() method.");
    }
}
