package patterns.creational.factoryMethod.dish;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Dish {
    private DishName dishName;
    private String ingredients;

    public abstract String getDishRecipe();

    public String getDishInfo() {
        return dishName + ":" + ingredients;
    }

    public void prepareDish(DishName dishName, String ingredients) {
        this.setDishName(dishName);
        this.setIngredients(ingredients);
    }
}
