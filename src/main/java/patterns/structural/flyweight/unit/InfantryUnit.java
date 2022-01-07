package patterns.structural.flyweight.unit;

import lombok.EqualsAndHashCode;
import patterns.structural.flyweight.unit.data.InfantryData;

@EqualsAndHashCode(callSuper = true)
public class InfantryUnit extends Unit {

    private final InfantryData infantryData;

    public InfantryUnit(int x, int y) {
        super(x, y);
        this.infantryData = UnitDataFactory.getInfantryData();
    }

    @Override
    public String playSound() {
        return infantryData.getSound();
    }
}
