package com.bussiness.product.service;

import com.bussiness.product.Domain.ProductDO;
import com.bussiness.product.Domain.UpdateProductDO;

public interface ProductService {
     void createProduct(ProductDO productDO);
     boolean updateProduct(String idProduct, UpdateProductDO updateProductDO);
     ProductDO getProductDetail(String idProduct);
}
