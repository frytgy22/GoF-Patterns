package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonPool pool = new SingletonPool();

        Singleton singleton1 = pool.checkOut();
        Singleton singleton2 = pool.checkOut();
        Singleton singleton3 = pool.checkOut();

        pool.checkIn(singleton1);
        pool.checkIn(singleton2);

        Singleton singleton4 = pool.checkOut();
        Singleton singleton5 = pool.checkOut();
    }
}
