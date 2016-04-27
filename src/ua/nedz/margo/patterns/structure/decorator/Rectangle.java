package ua.nedz.margo.patterns.structure.decorator;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}