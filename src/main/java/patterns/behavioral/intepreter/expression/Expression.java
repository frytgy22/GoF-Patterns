package patterns.behavioral.intepreter.expression;

import patterns.behavioral.command.pizzaComand.Command;

import java.util.List;

public interface Expression {
    List<Command> interpret(String... expressions);
}
