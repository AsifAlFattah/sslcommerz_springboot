package com.codeprophet.sslcommerz_springboot.controllers;



import com.codeprophet.sslcommerz_springboot.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/initiate")
    public String initiatePayment() {
        try {
            return paymentService.initiatePayment();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error initiating payment";
        }
    }

    @PostMapping("/validate")
    public boolean validatePayment(@RequestBody Map<String, String> requestParams) {
        try {
            return paymentService.validatePayment(requestParams);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

