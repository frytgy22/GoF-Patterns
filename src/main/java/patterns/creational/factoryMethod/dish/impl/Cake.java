package patterns.creational.factoryMethod.dish.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import patterns.creational.factoryMethod.dish.Dish;

@EqualsAndHashCode(callSuper = true)
@Data
public class Cake extends Dish {

    public static final String CAKE_RECIPE = "Add all ingredients and make a cake";

    @Override
    public String getDishRecipe() {
        return CAKE_RECIPE;
    }
}
