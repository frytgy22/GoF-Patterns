package patterns.behavioral.visitor.pizza;

import patterns.behavioral.visitor.pizzaVisitor.Visitor;

import java.util.List;

public class PizzaCreator {

    public Pizza createPizza(List<Visitor> visitors) {
        Pizza pizza = new Pizza();
        visitors.forEach(pizza::accept);

        return pizza;
    }
}
