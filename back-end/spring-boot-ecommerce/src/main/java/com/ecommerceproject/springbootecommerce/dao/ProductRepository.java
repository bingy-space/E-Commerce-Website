package com.ecommerceproject.springbootecommerce.dao;

import com.ecommerceproject.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
