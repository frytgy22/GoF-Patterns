package patterns.creational.abstractFactory.dishes.firstDish.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.firstDish.FirstDish;

public class AmericanFirstDish implements FirstDish {
    @Override
    public String getFirstDish() {
        return CuisineType.AMERICAN + " " + DishType.FIRST_DISH;
    }
}
