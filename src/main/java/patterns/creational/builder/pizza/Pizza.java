package patterns.creational.builder.pizza;

import lombok.Data;

@Data
public class Pizza {
    private final boolean containCheese;
    private final boolean containBacon;
    private final boolean containPineapples;
    private final boolean containMushrooms;
    private final boolean containSeafood;

    public Pizza(PizzaBuilder builder) {
        this.containCheese = builder.containCheese;
        this.containBacon = builder.containBacon;
        this.containPineapples = builder.containPineapples;
        this.containMushrooms = builder.containMushrooms;
        this.containSeafood = builder.containSeafood;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private boolean containCheese;
        private boolean containBacon;
        private boolean containPineapples;
        private boolean containMushrooms;
        private boolean containSeafood;

        private PizzaBuilder() {
        }

        public PizzaBuilder containCheese(boolean containCheese) {
            this.containCheese = containCheese;
            return this;
        }

        public PizzaBuilder containBacon(boolean containBacon) {
            this.containBacon = containBacon;
            return this;
        }

        public PizzaBuilder containPineapples(boolean containPineapples) {
            this.containPineapples = containPineapples;
            return this;
        }

        public PizzaBuilder containMushrooms(boolean containMushrooms) {
            this.containMushrooms = containMushrooms;
            return this;
        }

        public PizzaBuilder containSeafood(boolean containSeafood) {
            this.containSeafood = containSeafood;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
