package patterns.behavioral.mediator.service.impl;

import lombok.Data;
import patterns.behavioral.mediator.service.ConciergeService;
import patterns.behavioral.mediator.serviceMediator.Mediator;

@Data
public class TaxiService implements ConciergeService {
    private Mediator mediator;

    @Override
    public String getServiceInfo() {
        return mediator.getTaxi();
    }
}
