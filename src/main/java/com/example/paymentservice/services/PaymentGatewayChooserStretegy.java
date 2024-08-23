package com.example.paymentservice.services;

import com.example.paymentservice.services.paymentgateway.PaymentGateway;
import com.example.paymentservice.services.paymentgateway.RazorpayPaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayChooserStretegy {

    private RazorpayPaymentGateway razorpayPaymentGateway;

    public PaymentGatewayChooserStretegy(RazorpayPaymentGateway razorpayPaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway() {

        //some logic to choose the best payment gateway
        return razorpayPaymentGateway;
    }
}
