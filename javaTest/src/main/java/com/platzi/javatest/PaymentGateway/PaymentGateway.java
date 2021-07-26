package com.platzi.javatest.PaymentGateway;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
