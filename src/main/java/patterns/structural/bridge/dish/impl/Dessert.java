package patterns.structural.bridge.dish.impl;

import patterns.creational.abstractFactory.dishes.DishType;
import patterns.structural.bridge.cuisine.Cuisine;
import patterns.structural.bridge.dish.Dish;

public class Dessert extends Dish {

    public Dessert(Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public DishType getDishType() {
        return DishType.DESSERT;
    }
}
