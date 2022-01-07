package patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.bridge.cuisine.impl.UkrainianCuisine;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(new UkrainianCuisine());
        log.info(cafe.getFirstDish());
        log.info(cafe.getComplexLunch());
    }
}
