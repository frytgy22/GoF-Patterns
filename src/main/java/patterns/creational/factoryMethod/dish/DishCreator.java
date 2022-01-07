package patterns.creational.factoryMethod.dish;

import patterns.creational.factoryMethod.dish.impl.Borsch;
import patterns.creational.factoryMethod.dish.impl.Cake;

import java.util.HashMap;
import java.util.Map;

public class DishCreator {

    private static final Map<DishName, Dish> dishes = new HashMap<>();

    static {
        dishes.put(DishName.CAKE, new Cake());
        dishes.put(DishName.BORSCH, new Borsch());
    }

    private static Dish getDish(DishName dishName) {
        return dishes.get(dishName);
    }

    public static Dish createDish(DishName dishName, String ingredients) {
        Dish dish = getDish(dishName);
        dish.prepareDish(dishName, ingredients);
        return dish;
    }
}
