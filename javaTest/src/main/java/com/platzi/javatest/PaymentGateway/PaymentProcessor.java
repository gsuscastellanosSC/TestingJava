package com.platzi.javatest.PaymentGateway;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        return (response.getStatus() == PaymentResponse.PaymentStatus.OK)?true:false;
    }
}
