package com.emedical.springboot.emedical.service;

import com.emedical.springboot.emedical.dto.Purchase;
import com.emedical.springboot.emedical.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
