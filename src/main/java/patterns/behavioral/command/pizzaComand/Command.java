package patterns.behavioral.command.pizzaComand;

import patterns.behavioral.command.Pizza;

public interface Command {
    void execute(Pizza pizza);
}
