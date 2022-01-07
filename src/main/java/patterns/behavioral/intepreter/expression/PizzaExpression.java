package patterns.behavioral.intepreter.expression;

import patterns.behavioral.command.pizzaComand.*;

import java.util.*;
import java.util.stream.Collectors;

public class PizzaExpression implements Expression {
    private final Map<String, Command> commands = new HashMap<>();

    public PizzaExpression() {
        commands.put("bacon", new BaconCommand());
        commands.put("cheese", new CheeseCommand());
        commands.put("pineapples", new PineapplesCommand());
        commands.put("mushrooms", new MushroomsCommand());
        commands.put("seafood", new SeafoodCommand());
    }

    @Override
    public List<Command> interpret(String... expressions) {
        return Arrays.stream(expressions)
                .map(commands::get)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
