package ejemploPayment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor;

    // metodo para preparar el escenario, este se ejecuta antes de cada test, limpia los objetos (el escenario) para que no haya eerores en los test
    @Before
    public void setup() { // metodo de preparacion
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    // escenario pago correcto
    @Test
    public void payment_is_correct() {

        // simulando con mockito
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        boolean  result = paymentProcessor.makePayment(1000);

        //comprobacion
        assertTrue(result);
    }


    @Test
    public void payment_is_wrong() {

        // simulando con mockito
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        boolean  result = paymentProcessor.makePayment(1000); // ejecucion

        //comprobacion
        assertFalse(result);
    }
}