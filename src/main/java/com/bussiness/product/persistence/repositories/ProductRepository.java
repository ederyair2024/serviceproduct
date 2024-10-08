package com.bussiness.product.persistence.repositories;

import com.bussiness.product.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {

    Optional<Product> findByIdProduct(String idProduct);
}
