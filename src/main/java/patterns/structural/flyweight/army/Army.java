package patterns.structural.flyweight.army;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.flyweight.unit.Unit;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Army {
    private final List<Unit> units = new ArrayList<>();

    public void addInArmy(Unit unit) {
        units.add(unit);
    }

    public void moveArmy() {
        units.forEach(unit -> {
            unit.move();
            log.info(unit.playSound());
        });
    }
}
