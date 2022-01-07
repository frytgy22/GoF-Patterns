package patterns.behavioral.observer.stormNotificator;

import lombok.Getter;
import patterns.behavioral.observer.event.EventManager;

public class StormNotificator {

    @Getter
    private final EventManager eventManager;

    public StormNotificator() {
        this.eventManager = new EventManager(StormLevel.LOW, StormLevel.MEDIUM);
    }

    public void setFirstStormLevel() {
        eventManager.notify(StormLevel.LOW);
    }

    public void setSecondStormLevel() {
        eventManager.notify(StormLevel.MEDIUM);
    }
}
