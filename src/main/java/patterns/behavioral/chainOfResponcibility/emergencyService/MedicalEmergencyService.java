package patterns.behavioral.chainOfResponcibility.emergencyService;

public class MedicalEmergencyService extends EmergencyService {

    public MedicalEmergencyService(EmergencyService next) {
        super(next);
    }

    @Override
    public String call(Service service) {
        if (Service.MEDICAL.equals(service)) {
            return service.name();
        }
        return getNext().call(service);
    }
}
