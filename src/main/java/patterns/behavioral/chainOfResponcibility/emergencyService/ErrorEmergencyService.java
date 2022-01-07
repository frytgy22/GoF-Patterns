package patterns.behavioral.chainOfResponcibility.emergencyService;

public class ErrorEmergencyService extends EmergencyService {

    public ErrorEmergencyService() {
        super();
    }

    @Override
    public String call(Service service) {
        throw new IllegalArgumentException("Unknown emergency service");
    }
}
