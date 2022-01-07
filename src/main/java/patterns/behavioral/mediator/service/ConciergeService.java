package patterns.behavioral.mediator.service;

import patterns.behavioral.mediator.serviceMediator.Mediator;

public interface ConciergeService {
    String getServiceInfo();

    void setMediator(Mediator mediator);
}
