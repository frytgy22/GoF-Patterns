package patterns.creational.factoryMethod;


import lombok.extern.slf4j.Slf4j;
import patterns.creational.factoryMethod.dish.Dish;
import patterns.creational.factoryMethod.dish.DishCreator;
import patterns.creational.factoryMethod.dish.DishName;

@Slf4j
public class Bake {
    void cookDish(DishName dishName, String ingredients) {
        Dish dish = DishCreator.createDish(dishName, ingredients);

        log.info(dish.getDishInfo());
        log.info(dish.getDishRecipe());
    }
}
