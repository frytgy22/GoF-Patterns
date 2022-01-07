package patterns.behavioral.chainOfResponcibility;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioral.chainOfResponcibility.emergencyService.Service;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info(EmergencyServiceDispatcher.callEmergencyService(Service.POLICE));
    }
}
