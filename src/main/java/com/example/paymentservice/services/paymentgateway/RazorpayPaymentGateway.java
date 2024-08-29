package com.example.paymentservice.services.paymentgateway;
import com.razorpay.PaymentLink;
import org.json.JSONObject;
import com.razorpay.Payment;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class RazorpayPaymentGateway implements PaymentGateway {
    @Override
    public String generateLink() {
        try{

            RazorpayClient razorpay = new RazorpayClient("rzp_test_PsJ4ontxBYmhLV", "zCpi3H6W9fktqLgPoOfacwAX");
            JSONObject paymentLinkRequest = new JSONObject();
            paymentLinkRequest.put("amount",1000);
            paymentLinkRequest.put("currency","INR");
            paymentLinkRequest.put("accept_partial",true);
            paymentLinkRequest.put("first_min_partial_amount",100);
            paymentLinkRequest.put("expire_by",1724779840);
            paymentLinkRequest.put("reference_id","TS1989");
            paymentLinkRequest.put("description","Payment for policy no #23456");
            JSONObject customer = new JSONObject();
            customer.put("name","+917985533403");
            customer.put("contact","Digvijay Nath");
            customer.put("email","itsdiju@gmail.com");
            paymentLinkRequest.put("customer",customer);
            JSONObject notify = new JSONObject();
            notify.put("sms",true);
            notify.put("email",true);
            paymentLinkRequest.put("notify",notify);
            paymentLinkRequest.put("callback_url","https://google.com/");
            paymentLinkRequest.put("callback_method","get");

            PaymentLink payment = razorpay.paymentLink.create(paymentLinkRequest);
            return payment.toString();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;

    }
}
