package patterns.behavioral.strategy.sortStrategy.impl;

import patterns.behavioral.strategy.sortStrategy.SortStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> list) {
        Integer[] array = new ArrayList<>(list).toArray(new Integer[0]);
        Arrays.sort(array);
        return Arrays.asList(array);
    }
}
