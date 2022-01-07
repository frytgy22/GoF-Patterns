package patterns.structural.decorator.pizza.decorator;

import patterns.structural.decorator.pizza.Pizza;

public class PizzaDecorator implements Pizza {
    private final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza();
    }
}
