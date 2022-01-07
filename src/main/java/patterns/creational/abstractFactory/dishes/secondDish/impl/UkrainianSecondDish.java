package patterns.creational.abstractFactory.dishes.secondDish.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.secondDish.SecondDish;

public class UkrainianSecondDish implements SecondDish {
    @Override
    public String getSecondDish() {
        return CuisineType.UKRAINIAN + " " + DishType.SECOND_DISH;
    }
}
