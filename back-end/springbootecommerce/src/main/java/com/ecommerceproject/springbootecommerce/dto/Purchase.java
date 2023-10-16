package com.ecommerceproject.springbootecommerce.dto;

import java.util.Set;

import com.ecommerceproject.springbootecommerce.entity.Address;
import com.ecommerceproject.springbootecommerce.entity.Customer;
import com.ecommerceproject.springbootecommerce.entity.Order;
import com.ecommerceproject.springbootecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
