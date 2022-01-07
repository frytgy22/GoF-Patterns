package patterns.creational.builder;

import lombok.extern.slf4j.Slf4j;
import patterns.creational.builder.pizza.Pizza;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .containCheese(true)
                .containSeafood(true)
                .build();

        log.info(pizza.toString());
    }
}
