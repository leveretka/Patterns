package ua.nedz.margo.patterns.creation.factory_method.shapes;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
