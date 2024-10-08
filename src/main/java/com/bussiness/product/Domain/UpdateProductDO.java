package com.bussiness.product.Domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateProductDO {
    private String description;
    private String model;
}
