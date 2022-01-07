package patterns.creational.abstractFactory.dishes.firstDish.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.firstDish.FirstDish;

public class JapanFirstDish implements FirstDish {
    @Override
    public String getFirstDish() {
        return CuisineType.JAPAN + " " + DishType.FIRST_DISH;
    }
}
