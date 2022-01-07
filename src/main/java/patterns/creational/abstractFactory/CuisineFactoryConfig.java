package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.factory.AbstractCuisineFactory;
import patterns.creational.abstractFactory.factory.impl.JapanCuisineFactory;

public class CuisineFactoryConfig {

    public static AbstractCuisineFactory getCuisineFactory(){
        return new JapanCuisineFactory();
    }
}
