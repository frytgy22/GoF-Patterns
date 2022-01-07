package patterns.behavioral.visitor;

import patterns.behavioral.visitor.pizza.Pizza;
import patterns.behavioral.visitor.pizza.PizzaCreator;
import patterns.behavioral.visitor.pizzaVisitor.Visitor;
import patterns.behavioral.visitor.pizzaVisitor.impl.PizzaBaconVisitor;
import patterns.behavioral.visitor.pizzaVisitor.impl.PizzaCheeseVisitor;
import patterns.behavioral.visitor.pizzaVisitor.impl.PizzaMushroomsVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PizzaCreator pizzaCreator = new PizzaCreator();
        List<Visitor> visitors = Arrays.asList(new PizzaCheeseVisitor(), new PizzaBaconVisitor(), new PizzaMushroomsVisitor());

        Pizza pizza = pizzaCreator.createPizza(visitors);
        System.out.println(pizza);
    }
}
