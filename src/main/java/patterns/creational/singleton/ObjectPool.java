package patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public abstract class ObjectPool<T> {
    private static final int INSTANCE_MAX_COUNT = 10;
    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();

    protected abstract T create();

    public synchronized T checkOut() {
        if (inUse.size() < INSTANCE_MAX_COUNT) {
            if (available.isEmpty()) {
                available.add(create());
            }
            T instance = available.iterator().next();
            available.remove(instance);
            inUse.add(instance);
            log.info("Checked out: {}", instance);
            return instance;
        }
        throw new RuntimeException("Class instances should be less than " + INSTANCE_MAX_COUNT);
    }

    public synchronized void checkIn(T instance) {
        inUse.remove(instance);
        available.add(instance);
        log.info("Pool available: {} inUse: {}", available.size(), inUse.size());
    }
}
