package com.bussiness.product.server.controller.mapper;

import com.bussiness.product.Domain.ProductDO;
import com.bussiness.product.Domain.UpdateProductDO;
import com.bussiness.product.server.controller.request.ProductRequest;
import com.bussiness.product.server.controller.request.UpdateProductRequest;
import com.bussiness.product.server.controller.response.ProductResponse;
import org.mapstruct.Mapper;

import java.util.Map;

@Mapper
public interface ProductMapper {

    ProductDO productRequestToDO( ProductRequest request);

    UpdateProductDO updateProductRequestToDO(UpdateProductRequest updateProductResquest);

    ProductResponse productDOToResponse(ProductDO productDO);
}
