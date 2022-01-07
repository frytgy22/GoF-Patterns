package patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.decorator.pizza.Pizza;
import patterns.structural.decorator.pizza.PizzaPreparation;
import patterns.structural.decorator.pizza.decorator.impl.PizzaCheese;
import patterns.structural.decorator.pizza.decorator.impl.PizzaMushrooms;
import patterns.structural.decorator.pizza.decorator.impl.PizzaSeafood;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaCheese(new PizzaSeafood(new PizzaMushrooms(new PizzaPreparation())));
        log.info(pizza.makePizza());
    }
}
