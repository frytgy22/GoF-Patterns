package patterns.behavioral.chainOfResponcibility.emergencyService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class EmergencyService {
  private EmergencyService next;

    public abstract String call(Service service);
}
