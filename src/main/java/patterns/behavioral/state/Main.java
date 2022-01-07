package patterns.behavioral.state;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioral.state.bake.Bake;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Bake bake = new Bake();
        log.info(bake.switchOn());
        log.info(bake.bake());

        log.info(bake.switchOn());
        log.info(bake.switchOff());
        log.info(bake.switchOff());
        log.info(bake.switchOff());
    }
}
