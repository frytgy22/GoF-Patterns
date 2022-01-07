package patterns.behavioral.observer.observers.impl;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioral.observer.observers.Observer;

@Slf4j
public class SchoolObserver implements Observer {
    @Override
    public void notifyObserver() {
        log.info("school notified");
    }
}
