package patterns.behavioral.mediator.serviceMediator;

import patterns.behavioral.mediator.service.Service;

public interface Mediator {
    void notify(Service service);

    String getTaxi();

    String getFlower();

    String getHomeMaster();
}
