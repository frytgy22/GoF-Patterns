package patterns.creational.abstractFactory.dishes.thirdDish.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.thirdDish.ThirdDish;

public class UkrainianThirdDish implements ThirdDish {
    @Override
    public String getThirdDish() {
        return CuisineType.UKRAINIAN + " " + DishType.THIRD_DISH;
    }
}
