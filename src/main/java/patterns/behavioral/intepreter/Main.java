package patterns.behavioral.intepreter;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioral.command.Pizza;
import patterns.behavioral.command.PizzaCreator;
import patterns.behavioral.command.pizzaComand.Command;
import patterns.behavioral.intepreter.expression.PizzaExpression;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaExpression pizzaExpression = new PizzaExpression();
        List<Command> commands = pizzaExpression.interpret("cheese", "mushrooms", "bacon");

        PizzaCreator creator = new PizzaCreator(commands, pizza);
        creator.executePizzaCommands();

        log.info(pizza.toString());
    }
}
