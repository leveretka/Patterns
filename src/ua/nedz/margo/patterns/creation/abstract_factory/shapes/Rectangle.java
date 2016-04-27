package ua.nedz.margo.patterns.creation.abstract_factory.shapes;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + getColor() + " Rectangle::draw() method.");
    }
}
