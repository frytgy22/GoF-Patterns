package patterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioral.command.pizzaComand.BaconCommand;
import patterns.behavioral.command.pizzaComand.CheeseCommand;

import java.util.Arrays;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaCreator creator = new PizzaCreator(
                Arrays.asList(new BaconCommand(), new CheeseCommand()),
                pizza);

        creator.executePizzaCommands();
        log.info(pizza.toString());
    }
}
