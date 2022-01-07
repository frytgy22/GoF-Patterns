package patterns.structural.bridge.dish;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.creational.abstractFactory.dishes.DishType;
import patterns.structural.bridge.cuisine.Cuisine;

@Data
@AllArgsConstructor
public abstract class Dish {
    private Cuisine cuisine;

    protected abstract DishType getDishType();

    public String getDish() {
        return getDishType() + " " + cuisine.getCuisine();
    }
}
