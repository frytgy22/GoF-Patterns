package patterns.structural.composite;

import patterns.structural.composite.shape.Shape;
import patterns.structural.composite.shape.impl.Circle;
import patterns.structural.composite.shape.impl.CompoundShape;
import patterns.structural.composite.shape.impl.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new CompoundShape(
                new Circle(10),
                new CompoundShape(
                        new Circle(110),
                        new Rectangle(160)
                ),
                new CompoundShape(
                        new Rectangle(250),
                        new Circle(240),
                        new Circle(241),
                        new Circle(360),
                        new Rectangle(36)
                ));

        shape.incrementWeight();
        //shape.decrementWeight();
    }
}
