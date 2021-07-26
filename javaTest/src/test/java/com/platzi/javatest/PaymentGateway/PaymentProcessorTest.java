package com.platzi.javatest.PaymentGateway;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentProcessor paymentProcessor;
    private  PaymentGateway paymentGateway;

    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct(){

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        boolean result = paymentProcessor.makePayment(100);

        assertTrue(result);
    }

    @Test
    public void payment_is_not_wrong(){

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        boolean result = paymentProcessor.makePayment(100);

        assertFalse(result);
    }
}