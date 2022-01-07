package patterns.creational.abstractFactory.dishes.firstDish.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.firstDish.FirstDish;

public class UkrainianFirstDish implements FirstDish {
    @Override
    public String getFirstDish() {
        return CuisineType.UKRAINIAN + " " + DishType.FIRST_DISH;
    }
}
