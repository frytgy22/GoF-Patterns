package patterns.structural.proxy;

import lombok.Value;
import patterns.structural.facade.Facade;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProxyCalculator implements Facade {
    private static final int CAPACITY = 20;
    private final Facade facade;

    private static final Map<NumberOperation, Integer> cache = new CalculatorCache<>(CAPACITY);

    public ProxyCalculator(Facade facade) {
        this.facade = facade;
    }

    @Override
    public int add(int firstNum, int secondNum) {
        return cache.computeIfAbsent(new NumberOperation("add", firstNum, secondNum),
                (key) -> facade.add(firstNum, secondNum));
    }

    @Override
    public int divide(int firstNum, int secondNum) {
        return cache.computeIfAbsent(new NumberOperation("divide", firstNum, secondNum),
                (key) -> facade.divide(firstNum, secondNum));
    }

    @Override
    public int multiply(int firstNum, int secondNum) {
        return cache.computeIfAbsent(new NumberOperation("multiply", firstNum, secondNum),
                key -> facade.multiply(firstNum, secondNum));
    }

    @Override
    public int subtract(int firstNum, int secondNum) {
        return cache.computeIfAbsent(new NumberOperation("subtract", firstNum, secondNum),
                (key) -> facade.subtract(firstNum, secondNum));
    }

    @Value
    private static class NumberOperation {
        String operation;
        int firstNum;
        int secondNum;
    }

    private static class CalculatorCache<K, V> extends LinkedHashMap<K, V> {
        private final int size;

        public CalculatorCache(int size) {
            super(size, 0.75f, true);//true for access-order, false for insertion-order
            this.size = size;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > size;
        }
    }
}
