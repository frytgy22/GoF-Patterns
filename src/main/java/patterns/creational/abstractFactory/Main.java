package patterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;
import patterns.creational.abstractFactory.factory.AbstractCuisineFactory;

@Slf4j
public class Main {
    public static void main(String[] args) {
        AbstractCuisineFactory cuisineFactory = CuisineFactoryConfig.getCuisineFactory();

        Cafe cafe = new Cafe(cuisineFactory);
        log.info(cafe.getComplexLunch());
        log.info(cafe.getDessert());
    }
}
