package patterns.structural.bridge.cuisine.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.structural.bridge.cuisine.Cuisine;

public class UkrainianCuisine implements Cuisine {
    @Override
    public CuisineType getCuisine() {
        return CuisineType.UKRAINIAN;
    }
}
