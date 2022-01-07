package patterns.structural.bridge.dish.impl;

import patterns.creational.abstractFactory.dishes.DishType;
import patterns.structural.bridge.cuisine.Cuisine;
import patterns.structural.bridge.dish.Dish;

public class SecondDish extends Dish {
    public SecondDish(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public DishType getDishType() {
        return DishType.SECOND_DISH;
    }
}
