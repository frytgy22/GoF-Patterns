package patterns.creational.singleton;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

@Data
@Slf4j
public class Singleton {
    private static final AtomicInteger counter = new AtomicInteger(0);

    private final int id;

    public Singleton() {
        id = counter.incrementAndGet();
        log.info("created new instance with id: {}", id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
