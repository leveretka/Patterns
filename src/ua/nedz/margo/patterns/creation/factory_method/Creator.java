package ua.nedz.margo.patterns.creation.factory_method;

import ua.nedz.margo.patterns.creation.factory_method.shapes.Circle;
import ua.nedz.margo.patterns.creation.factory_method.shapes.Rectangle;
import ua.nedz.margo.patterns.creation.factory_method.shapes.Shape;
import ua.nedz.margo.patterns.creation.factory_method.shapes.Square;

public class Creator {

    public Shape createShape(ShapeName shapeName) {
        switch (shapeName) {
            case RECTANGLE: return new Rectangle();

            case SQUARE: return new Square();

            case CIRCLE: return new Circle();
        }
        return null;
    }

}
