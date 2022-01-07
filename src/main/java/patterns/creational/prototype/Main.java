package patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;
import patterns.creational.prototype.auto.Auto;
import patterns.creational.prototype.auto.Color;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Auto auto = Auto.TRUCK.createAuto(Color.BLACK, 555);
        log.info(auto.toString());
    }
}
