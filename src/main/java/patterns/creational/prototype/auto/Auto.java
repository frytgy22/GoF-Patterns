package patterns.creational.prototype.auto;

import lombok.Data;

@Data
public class Auto implements Cloneable {

    public static final Auto TRUCK = new Auto(AutoType.TRUCK);
    public static final Auto MINIVAN = new Auto(AutoType.MINIVAN);
    public static final Auto PASSENGER = new Auto(AutoType.PASSENGER);

    private final Color color;
    private final Integer number;
    private final AutoType autoType;

    public Auto(Auto auto, Color color, int number) {
        this.autoType = auto.autoType;
        this.color = color;
        this.number = number;
    }

    public Auto(AutoType autoType) {
        this.autoType = autoType;
        this.number = null;
        this.color = null;
    }

    public Auto createAuto(Color color, int number) {
        return new Auto(this, color, number);
    }
}
