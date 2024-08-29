package com.example.paymentservice.controllers;
import com.stripe.model.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stripeWebhook")
public class StripeWebhookController {

    @PostMapping
    public void webhook() {
        System.out.println("Stripe Webhook received");
    }
}