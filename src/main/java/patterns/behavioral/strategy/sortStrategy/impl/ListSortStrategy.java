package patterns.behavioral.strategy.sortStrategy.impl;

import patterns.behavioral.strategy.sortStrategy.SortStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortStrategy implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }
}
