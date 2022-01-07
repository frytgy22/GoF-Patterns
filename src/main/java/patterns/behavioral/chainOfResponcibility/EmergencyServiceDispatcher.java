package patterns.behavioral.chainOfResponcibility;

import patterns.behavioral.chainOfResponcibility.emergencyService.*;

public class EmergencyServiceDispatcher {
    private static final EmergencyService emergencyService;

    static {
        emergencyService = new MedicalEmergencyService(
                new PoliceEmergencyService(
                        new FireFightersEmergencyService(
                                new ErrorEmergencyService()
                        )
                )
        );
    }

    public static String callEmergencyService(Service service) {
        return emergencyService.call(service);
    }
}
