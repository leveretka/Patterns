package ua.nedz.margo.patterns.creation.factory_method.shapes;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}