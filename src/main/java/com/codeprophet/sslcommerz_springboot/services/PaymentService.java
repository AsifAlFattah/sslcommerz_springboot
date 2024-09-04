package com.codeprophet.sslcommerz_springboot.services;
import org.springframework.stereotype.Service;
import com.codeprophet.sslcommerz_springboot.sslcommerz.SSLCommerz;
import com.codeprophet.sslcommerz_springboot.sslcommerz.TransactionInitiator;
import com.codeprophet.sslcommerz_springboot.sslcommerz.TransactionResponseValidator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {


//    private String storeId = "codep66d6f3377b488";
//    private String storePass = "codep66d6f3377b488@ssl";
//    private boolean testMode = true;

    public String initiatePayment() throws Exception {
//        SSLCommerz sslCommerz = new SSLCommerz(storeId, storePass, testMode);
        TransactionInitiator initiator = new TransactionInitiator();
        return initiator.initTrnxnRequest();
    }

    public boolean validatePayment(Map<String, String> requestParams) throws Exception {
        TransactionResponseValidator validator = new TransactionResponseValidator();
        return validator.receiveSuccessResponse(requestParams);
    }
}
