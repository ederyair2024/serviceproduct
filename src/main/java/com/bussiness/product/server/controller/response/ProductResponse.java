package com.bussiness.product.server.controller.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductResponse {

    private String idProduct;

    private String name;

    private String description;

    private BigDecimal price;

    private String model;
}
