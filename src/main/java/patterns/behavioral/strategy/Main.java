package patterns.behavioral.strategy;

import patterns.behavioral.strategy.sortStrategy.impl.QuickSortStrategy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> unsortedList = Arrays.asList(3, 8, 1, 98, 0, 15);

        Context context = new Context(new QuickSortStrategy());
        List<Integer> sortedList = context.sort(unsortedList);

        System.out.println(sortedList);
    }
}
