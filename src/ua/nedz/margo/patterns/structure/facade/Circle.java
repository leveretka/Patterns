package ua.nedz.margo.patterns.structure.facade;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}