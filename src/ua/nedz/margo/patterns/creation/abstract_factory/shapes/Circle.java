package ua.nedz.margo.patterns.creation.abstract_factory.shapes;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + getColor() + " Circle::draw() method.");
    }
}