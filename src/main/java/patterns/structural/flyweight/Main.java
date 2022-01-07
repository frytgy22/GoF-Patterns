package patterns.structural.flyweight;

import patterns.structural.flyweight.army.Army;
import patterns.structural.flyweight.unit.InfantryUnit;
import patterns.structural.flyweight.unit.TankUnit;

public class Main {
    public static void main(String[] args) {
        Army army = new Army();
        army.addInArmy(new InfantryUnit(5, 7));
        army.addInArmy(new InfantryUnit(6, 9));
        army.addInArmy(new InfantryUnit(15, 17));
        army.addInArmy(new TankUnit(25, 27));
        army.addInArmy(new TankUnit(35, 37));

        army.moveArmy();
    }
}
