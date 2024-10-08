package com.bussiness.product.server.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateProductRequest {


    @NotBlank
    @Size(max = 200)
    private String description;
    @NotBlank
    @Size(max = 10)
    private String model;
}
