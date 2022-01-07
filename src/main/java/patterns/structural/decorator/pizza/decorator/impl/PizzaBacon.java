package patterns.structural.decorator.pizza.decorator.impl;

import patterns.structural.decorator.pizza.Pizza;
import patterns.structural.decorator.pizza.decorator.PizzaDecorator;

public class PizzaBacon extends PizzaDecorator {

    public PizzaBacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + "bacon\n";
    }
}
