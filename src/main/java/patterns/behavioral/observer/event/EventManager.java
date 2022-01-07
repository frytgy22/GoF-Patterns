package patterns.behavioral.observer.event;

import patterns.behavioral.observer.observers.Observer;
import patterns.behavioral.observer.stormNotificator.StormLevel;

import java.util.*;

public class EventManager {
    private final Map<StormLevel, List<Observer>> observers = new HashMap<>();

    public EventManager(StormLevel... levels) {
        Arrays.stream(levels)
                .forEach(level -> observers.put(level, new ArrayList<>()));
    }

    public void subscribe(StormLevel level, Observer observer) {
        if (observers.containsKey(level)) {
            observers.get(level)
                    .add(observer);
        }
    }

    public void unsubscribe(StormLevel level, Observer observer) {
        if (observers.containsKey(level)) {
            observers.get(level)
                    .remove(observer);
        }
    }

    public void notify(StormLevel level) {
        observers.get(level)
                .forEach(Observer::notifyObserver);
    }
}
