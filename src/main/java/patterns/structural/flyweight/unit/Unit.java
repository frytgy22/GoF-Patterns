package patterns.structural.flyweight.unit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Unit {
    private int x;
    private int y;

    public void move() {
        x++;
        y++;
    }

    public abstract String playSound();
}
