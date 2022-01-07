package patterns.creational.abstractFactory.dishes.dessert.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.dessert.Dessert;

public class AmericanDessert implements Dessert {
    @Override
    public String getDessert() {
        return CuisineType.AMERICAN + " " + DishType.DESSERT;
    }
}
