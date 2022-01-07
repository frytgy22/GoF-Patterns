package patterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.behavioral.strategy.sortStrategy.SortStrategy;

import java.util.List;

@Data
@AllArgsConstructor
public class Context {
    private SortStrategy sortStrategy;

    public List<Integer> sort(List<Integer> list) {
        return sortStrategy.sort(list);
    }
}
