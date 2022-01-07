package patterns.behavioral.mediator.serviceMediator.impl;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioral.mediator.service.ConciergeService;
import patterns.behavioral.mediator.service.Service;
import patterns.behavioral.mediator.service.impl.FlowerDeliveryService;
import patterns.behavioral.mediator.service.impl.HomeMasterService;
import patterns.behavioral.mediator.service.impl.TaxiService;
import patterns.behavioral.mediator.serviceMediator.Mediator;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ConciergeMediator implements Mediator {
    private static final Map<Service, ConciergeService> services = new HashMap<>();

    static {
        services.put(Service.TAXI, new TaxiService());
        services.put(Service.FLOWERS, new FlowerDeliveryService());
        services.put(Service.HOME_MASTER, new HomeMasterService());
    }

    @Override
    public void notify(Service service) {
        ConciergeService conciergeService = services.get(service);

        if (conciergeService != null) {
            conciergeService.setMediator(this);
            log.info(conciergeService.getServiceInfo());
        }
    }

    @Override
    public String getTaxi() {
        return Service.TAXI.name();
    }

    @Override
    public String getFlower() {
        return Service.FLOWERS.name();
    }

    @Override
    public String getHomeMaster() {
        return Service.HOME_MASTER.name();
    }

}
