package patterns.creational.factoryMethod.dish.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import patterns.creational.factoryMethod.dish.Dish;

@EqualsAndHashCode(callSuper = true)
@Data
public class Borsch extends Dish {

    private static final String BORSCH_RECIPE = "Add all ingredients and make a borsch";

    @Override
    public String getDishRecipe() {
        return BORSCH_RECIPE;
    }
}
