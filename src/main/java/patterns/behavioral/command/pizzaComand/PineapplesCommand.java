package patterns.behavioral.command.pizzaComand;

import patterns.behavioral.command.Pizza;

public class PineapplesCommand implements Command {

    @Override
    public void execute(Pizza pizza) {
        pizza.setContainPineapples(true);
    }
}
