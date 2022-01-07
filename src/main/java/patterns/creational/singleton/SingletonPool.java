package patterns.creational.singleton;

public class SingletonPool extends ObjectPool<Singleton> {

    @Override
    protected Singleton create() {
        return new Singleton();
    }
}
