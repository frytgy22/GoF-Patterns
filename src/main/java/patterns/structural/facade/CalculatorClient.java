package patterns.structural.facade;

import calculator.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class CalculatorClient extends WebServiceGatewaySupport {

    private static final String HTTP_TEMPURI_ORG = "http://tempuri.org/";

    public AddResponse add(int intA, int intB) {
        Add request = new Add();
        request.setIntA(intA);
        request.setIntB(intB);

        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(HTTP_TEMPURI_ORG + "Add"));
    }

    public SubtractResponse subtract(int intA, int intB) {
        Subtract request = new Subtract();
        request.setIntA(intA);
        request.setIntB(intB);

        return (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(HTTP_TEMPURI_ORG + "Subtract"));
    }

    public MultiplyResponse multiply(int intA, int intB) {
        Multiply request = new Multiply();
        request.setIntA(intA);
        request.setIntB(intB);

        return (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(HTTP_TEMPURI_ORG + "Multiply"));
    }

    public DivideResponse divide(int intA, int intB) {
        Divide request = new Divide();
        request.setIntA(intA);
        request.setIntB(intB);

        return (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(HTTP_TEMPURI_ORG + "Divide"));
    }
}
