package patterns.creational.abstractFactory.dishes.dessert.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.dessert.Dessert;

public class UkrainianDessert implements Dessert {
    @Override
    public String getDessert() {
        return CuisineType.UKRAINIAN + " " + DishType.DESSERT;
    }
}
