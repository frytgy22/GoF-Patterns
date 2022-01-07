package patterns.behavioral.visitor.pizzaVisitor;

import patterns.behavioral.visitor.pizza.Pizza;

public interface Visitor {
    void visit(Pizza pizza);
}
