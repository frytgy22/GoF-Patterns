package patterns.behavioral.mediator;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioral.mediator.service.Service;
import patterns.behavioral.mediator.serviceMediator.Mediator;
import patterns.behavioral.mediator.serviceMediator.impl.ConciergeMediator;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConciergeMediator();
        mediator.notify(Service.TAXI);
    }
}
