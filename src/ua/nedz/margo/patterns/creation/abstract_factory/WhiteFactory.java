package ua.nedz.margo.patterns.creation.abstract_factory;

import ua.nedz.margo.patterns.creation.abstract_factory.shapes.Circle;
import ua.nedz.margo.patterns.creation.abstract_factory.shapes.Rectangle;
import ua.nedz.margo.patterns.creation.abstract_factory.shapes.Shape;
import ua.nedz.margo.patterns.creation.abstract_factory.shapes.Square;

public class WhiteFactory implements AbstractFactory {
    @Override
    public Rectangle createRectangle() {
        return (Rectangle) wrap(new Rectangle());
    }

    @Override
    public Square createSquare() {
        return (Square) wrap(new Square());
    }

    @Override
    public Circle createCircle() {
        return (Circle) wrap(new Circle());
    }

    private Shape wrap(Shape shape) {
        shape.setColor("White");
        return shape;
    }
}
