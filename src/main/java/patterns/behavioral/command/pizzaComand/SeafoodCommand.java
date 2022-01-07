package patterns.behavioral.command.pizzaComand;

import patterns.behavioral.command.Pizza;

public class SeafoodCommand implements Command {

    @Override
    public void execute(Pizza pizza) {
        pizza.setContainSeafood(true);
    }
}
