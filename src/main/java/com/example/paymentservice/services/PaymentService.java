package com.example.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentGatewayChooserStretegy paymentGatewayChooserStretegy;


    public PaymentService(PaymentGatewayChooserStretegy paymentGatewayChooserStretegy) {
        this.paymentGatewayChooserStretegy = paymentGatewayChooserStretegy;
    }

    public String initiatePayment() {
        return paymentGatewayChooserStretegy
                .getBestPaymentGateway()
                .generateLink();
    }

}
