package patterns.structural.flyweight.unit;

import lombok.experimental.UtilityClass;
import patterns.structural.flyweight.unit.data.InfantryData;
import patterns.structural.flyweight.unit.data.TankData;

@UtilityClass
public class UnitDataFactory {
    private final TankData tankData;
    private final InfantryData infantryData;

    static {
        tankData = new TankData("tank texture", "tank sound");
        infantryData = new InfantryData("infantry texture", "infantry sound");
    }

    public static TankData getTankData() {
        return tankData;
    }

    public static InfantryData getInfantryData() {
        return infantryData;
    }

}
