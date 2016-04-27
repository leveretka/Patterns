package ua.nedz.margo.patterns.creation.factory_method.shapes;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
