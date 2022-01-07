package patterns.behavioral.observer;

import patterns.behavioral.observer.observers.impl.AirportObserver;
import patterns.behavioral.observer.observers.impl.RoadServiceObserver;
import patterns.behavioral.observer.observers.impl.SchoolObserver;
import patterns.behavioral.observer.stormNotificator.StormLevel;
import patterns.behavioral.observer.stormNotificator.StormNotificator;

public class Main {
    public static void main(String[] args) {
        StormNotificator notificator = new StormNotificator();
        notificator.getEventManager().subscribe(StormLevel.LOW, new SchoolObserver());
        notificator.getEventManager().subscribe(StormLevel.MEDIUM, new RoadServiceObserver());
        notificator.getEventManager().subscribe(StormLevel.MEDIUM, new AirportObserver());

        notificator.setSecondStormLevel();
    }
}
