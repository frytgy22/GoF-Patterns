package patterns.structural.decorator.pizza.decorator.impl;

import patterns.structural.decorator.pizza.Pizza;
import patterns.structural.decorator.pizza.decorator.PizzaDecorator;

public class PizzaCheese extends PizzaDecorator {

    public PizzaCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + "cheese\n";
    }
}
