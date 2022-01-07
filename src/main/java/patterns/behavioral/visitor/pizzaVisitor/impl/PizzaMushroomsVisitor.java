package patterns.behavioral.visitor.pizzaVisitor.impl;

import patterns.behavioral.visitor.pizza.Pizza;
import patterns.behavioral.visitor.pizzaVisitor.Visitor;

public class PizzaMushroomsVisitor implements Visitor {
    @Override
    public void visit(Pizza pizza) {
        pizza.setContainMushrooms(true);
    }
}
