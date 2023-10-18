package com.ecommerceproject.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceproject.springbootecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
