package com.ecommerceproject.springbootecommerce.service;

import com.ecommerceproject.springbootecommerce.dto.Purchase;
import com.ecommerceproject.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
