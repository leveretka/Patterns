package ua.nedz.margo.patterns.creation.abstract_factory;

import ua.nedz.margo.patterns.creation.abstract_factory.shapes.Circle;
import ua.nedz.margo.patterns.creation.abstract_factory.shapes.Rectangle;
import ua.nedz.margo.patterns.creation.abstract_factory.shapes.Square;

public interface AbstractFactory {

    Rectangle createRectangle();

    Square createSquare();

    Circle createCircle();

}
