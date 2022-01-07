package patterns.creational.abstractFactory.dishes.thirdDish.impl;

import patterns.creational.abstractFactory.dishes.CuisineType;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.creational.abstractFactory.dishes.thirdDish.ThirdDish;

public class JapanThirdDish implements ThirdDish {
    @Override
    public String getThirdDish() {
        return CuisineType.JAPAN + " " + DishType.THIRD_DISH;
    }
}
