package com.bussiness.product.Domain;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class ProductDO {

    private String idProduct;

    private String name;

    private String description;

    private BigDecimal price;

    private String model;
}
