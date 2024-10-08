package com.bussiness.product.service.mapper;

import com.bussiness.product.Domain.ProductDO;
import com.bussiness.product.persistence.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductServiceMapper {

    Product toProduct(ProductDO productDO);
    ProductDO ToProductDO(Product product);
}
