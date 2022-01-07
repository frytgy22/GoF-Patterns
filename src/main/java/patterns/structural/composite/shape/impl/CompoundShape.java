package patterns.structural.composite.shape.impl;

import patterns.structural.composite.shape.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape {
    private final List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(0);
        children.addAll(Arrays.asList(components));
    }

    @Override
    public void decrementWeight() {
        if (children.isEmpty()) {
            return;
        }
        for (Shape child : children) {
            child.decrementWeight();
            System.out.println(child.getWeight());
        }
        super.decrementWeight();
    }

    @Override
    public void incrementWeight() {
        if (children.isEmpty()) {
            return;
        }
        for (Shape child : children) {
            child.incrementWeight();
            System.out.println(child.getWeight());
        }
        super.incrementWeight();
    }
}
