package patterns.structural.decorator.pizza;

public class PizzaPreparation implements Pizza {

    @Override
    public String makePizza() {
        return "dough, sauce\n";
    }
}
