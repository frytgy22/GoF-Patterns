package patterns.structural.flyweight.unit;

import lombok.EqualsAndHashCode;
import patterns.structural.flyweight.unit.data.TankData;

@EqualsAndHashCode(callSuper = true)
public class TankUnit extends Unit {

    private final TankData tankData;

    public TankUnit(int x, int y) {
        super(x, y);
        this.tankData = UnitDataFactory.getTankData();
    }

    @Override
    public String playSound() {
        return tankData.getSound();
    }
}
