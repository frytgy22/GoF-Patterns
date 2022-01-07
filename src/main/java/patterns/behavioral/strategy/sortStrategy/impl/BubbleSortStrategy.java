package patterns.behavioral.strategy.sortStrategy.impl;

import patterns.behavioral.strategy.sortStrategy.SortStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> list) {
        Integer[] array = new ArrayList<>(list).toArray(new Integer[0]);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return Arrays.asList(array);
    }
}
