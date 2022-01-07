package patterns.behavioral.visitor.pizza;

import lombok.Data;
import patterns.behavioral.visitor.pizzaVisitor.Visitor;

@Data
public class Pizza {
    private boolean containCheese;
    private boolean containBacon;
    private boolean containPineapples;
    private boolean containMushrooms;
    private boolean containSeafood;

    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
