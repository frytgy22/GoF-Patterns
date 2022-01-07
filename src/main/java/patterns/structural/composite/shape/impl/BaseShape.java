package patterns.structural.composite.shape.impl;

import patterns.structural.composite.shape.Shape;

public abstract class BaseShape implements Shape {

    private int weight;

    public BaseShape(int weight) {
        this.weight = weight;
    }

    @Override
    public void decrementWeight() {
        --weight;
    }

    @Override
    public void incrementWeight() {
        ++weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
