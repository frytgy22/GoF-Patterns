package patterns.behavioral.chainOfResponcibility.emergencyService;

public class PoliceEmergencyService extends EmergencyService {

    public PoliceEmergencyService(EmergencyService next) {
        super(next);
    }

    @Override
    public String call(Service service) {
        if (Service.POLICE.equals(service)) {
            return service.name();
        }
        return getNext().call(service);
    }
}
