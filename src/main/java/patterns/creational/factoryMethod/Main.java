package patterns.creational.factoryMethod;

import patterns.creational.factoryMethod.dish.DishName;
import patterns.creational.factoryMethod.dish.config.DishConfig;
import patterns.creational.factoryMethod.dish.config.DishProperty;

public class Main {
    public static void main(String[] args) {
        String dishName = DishConfig.getProperty(DishProperty.DISH_NAME);
        String ingredients = DishConfig.getProperty(DishProperty.INGREDIENTS);

        Bake bake = new Bake();
        bake.cookDish(DishName.valueOf(dishName), ingredients);
    }
}
