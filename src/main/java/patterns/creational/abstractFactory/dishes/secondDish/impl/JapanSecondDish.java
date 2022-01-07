package patterns.creational.abstractFactory.dishes.secondDish.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.secondDish.SecondDish;

public class JapanSecondDish implements SecondDish {
    @Override
    public String getSecondDish() {
        return CuisineType.JAPAN + " " + DishType.SECOND_DISH;
    }
}
