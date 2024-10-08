package com.bussiness.product.server.controller.request;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductRequest {

    @NotBlank
    @Size(max = 10)
    private String idProduct;
    @NotBlank
    @Size(max = 20)
    private String name;
    @NotBlank
    @Size(max = 200)
    private String description;
    @Digits(integer = 10, fraction = 2)
    private BigDecimal price;
    @NotBlank
    @Size(max = 10)
    private String model;

}
