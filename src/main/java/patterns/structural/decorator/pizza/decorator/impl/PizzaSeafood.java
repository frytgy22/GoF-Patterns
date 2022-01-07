package patterns.structural.decorator.pizza.decorator.impl;

import patterns.structural.decorator.pizza.Pizza;
import patterns.structural.decorator.pizza.decorator.PizzaDecorator;

public class PizzaSeafood extends PizzaDecorator {

    public PizzaSeafood(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + "seafood\n";
    }
}
