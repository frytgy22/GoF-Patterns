package patterns.structural.facade;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class FacadeCalculator implements Facade{
    private static final CalculatorClient client;

    static {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("calculator.wsdl");

        client = new CalculatorClient();
        client.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
    }

    @Override
    public int add(int firstNum, int secondNum) {
        return client.add(firstNum, secondNum).getAddResult();
    }

    @Override
    public int divide(int firstNum, int secondNum) {
        return client.divide(firstNum, secondNum).getDivideResult();
    }

    @Override
    public int multiply(int firstNum, int secondNum) {
        return client.multiply(firstNum, secondNum).getMultiplyResult();
    }

    @Override
    public int subtract(int firstNum, int secondNum) {
        return client.subtract(firstNum, secondNum).getSubtractResult();
    }
}
