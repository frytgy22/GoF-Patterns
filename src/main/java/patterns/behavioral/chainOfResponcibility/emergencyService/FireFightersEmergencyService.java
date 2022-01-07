package patterns.behavioral.chainOfResponcibility.emergencyService;

public class FireFightersEmergencyService extends EmergencyService {

    public FireFightersEmergencyService(EmergencyService next) {
        super(next);
    }

    @Override
    public String call(Service service) {
        if (Service.FIREFIGHTERS.equals(service)) {
            return service.name();
        }
        return getNext().call(service);
    }
}
