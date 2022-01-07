package patterns.structural.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import patterns.structural.proxy.ProxyCalculator;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        Facade facadeCalculator = new ProxyCalculator(new FacadeCalculator());
        System.out.println(facadeCalculator.add(6, 9));
        System.out.println(facadeCalculator.divide(25, 5));
        System.out.println(facadeCalculator.multiply(6, 9));
        System.out.println(facadeCalculator.subtract(6, 9));
        System.out.println(facadeCalculator.add(7, 9));
        System.out.println(facadeCalculator.divide(85, 5));
        System.out.println(facadeCalculator.multiply(86, 9));
        System.out.println(facadeCalculator.subtract(66, 9));
    }
}
