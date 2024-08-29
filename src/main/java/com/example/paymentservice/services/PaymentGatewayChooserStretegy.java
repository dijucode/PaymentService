package com.example.paymentservice.services;

import com.example.paymentservice.services.paymentgateway.PaymentGateway;
import com.example.paymentservice.services.paymentgateway.RazorpayPaymentGateway;
import com.example.paymentservice.services.paymentgateway.StripePaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayChooserStretegy {

    private RazorpayPaymentGateway razorpayPaymentGateway;
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGatewayChooserStretegy(RazorpayPaymentGateway razorpayPaymentGateway, StripePaymentGateway stripePaymentGateway) {
        this.razorpayPaymentGateway = razorpayPaymentGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway() {

        //some logic to choose the best payment gateway
        return stripePaymentGateway;
    }
}
