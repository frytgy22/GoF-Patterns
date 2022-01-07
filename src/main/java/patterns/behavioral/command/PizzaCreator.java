package patterns.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.behavioral.command.pizzaComand.Command;

import java.util.List;

@Data
@AllArgsConstructor
public class PizzaCreator {
    private List<Command> commands;
    private Pizza pizza;

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executePizzaCommands() {
        commands.forEach(command -> command.execute(pizza));
    }
}
