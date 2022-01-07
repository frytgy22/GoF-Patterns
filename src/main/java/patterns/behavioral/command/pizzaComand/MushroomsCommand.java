package patterns.behavioral.command.pizzaComand;

import patterns.behavioral.command.Pizza;

public class MushroomsCommand implements Command {

    @Override
    public void execute(Pizza pizza) {
        pizza.setContainMushrooms(true);
    }
}
