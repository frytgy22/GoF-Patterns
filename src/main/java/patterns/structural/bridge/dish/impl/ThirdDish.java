package patterns.structural.bridge.dish.impl;

import patterns.creational.abstractFactory.dishes.DishType;
import patterns.structural.bridge.cuisine.Cuisine;
import patterns.structural.bridge.dish.Dish;

public class ThirdDish extends Dish {
    public ThirdDish(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public DishType getDishType() {
        return DishType.THIRD_DISH;
    }
}
