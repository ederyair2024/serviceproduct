package com.bussiness.product.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.math.BigDecimal;


@Entity
@Data
public class Product {
    @Id
    private String idProduct;

    private String name;

    private String description;

    private BigDecimal price;

    private String model;

}
