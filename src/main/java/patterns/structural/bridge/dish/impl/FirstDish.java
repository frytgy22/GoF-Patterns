package patterns.structural.bridge.dish.impl;

import patterns.creational.abstractFactory.dishes.DishType;
import patterns.structural.bridge.cuisine.Cuisine;
import patterns.structural.bridge.dish.Dish;

public class FirstDish extends Dish {

    public FirstDish(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public DishType getDishType() {
        return DishType.FIRST_DISH;
    }
}
