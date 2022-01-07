package patterns.creational.factoryMethod.dish.config;

import patterns.creational.factoryMethod.dish.DishName;

import java.util.HashMap;
import java.util.Map;

public class DishConfig {

    private static final Map<DishProperty, String> dishConfigs = new HashMap<>();

    static {
        dishConfigs.put(DishProperty.DISH_NAME, DishName.BORSCH.name());
        dishConfigs.put(DishProperty.INGREDIENTS, "some ingredients");
    }

    public static String getProperty(DishProperty property) {
        return dishConfigs.get(property);
    }
}
