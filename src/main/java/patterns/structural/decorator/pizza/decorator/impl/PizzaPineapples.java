package patterns.structural.decorator.pizza.decorator.impl;

import patterns.structural.decorator.pizza.Pizza;
import patterns.structural.decorator.pizza.decorator.PizzaDecorator;

public class PizzaPineapples extends PizzaDecorator {

    public PizzaPineapples(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + "pineapples\n";
    }
}
