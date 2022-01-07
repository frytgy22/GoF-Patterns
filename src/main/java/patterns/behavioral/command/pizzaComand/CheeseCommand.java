package patterns.behavioral.command.pizzaComand;

import patterns.behavioral.command.Pizza;

public class CheeseCommand implements Command {

    @Override
    public void execute(Pizza pizza) {
        pizza.setContainCheese(true);
    }
}
