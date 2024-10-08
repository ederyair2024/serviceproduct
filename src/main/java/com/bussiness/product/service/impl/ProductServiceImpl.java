package com.bussiness.product.service.impl;

import com.bussiness.product.Domain.ProductDO;
import com.bussiness.product.Domain.UpdateProductDO;
import com.bussiness.product.persistence.entity.Product;
import com.bussiness.product.persistence.repositories.ProductRepository;
import com.bussiness.product.service.ProductService;
import com.bussiness.product.service.mapper.ProductServiceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Objects;


@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductServiceMapper mapper;
    private final ProductRepository repository;

    @Override
    public void createProduct(ProductDO productDO){
         repository.save(mapper.toProduct(productDO));
    }

    @Override
    public boolean updateProduct(String idProduct, UpdateProductDO updateProductDO){
        Product product =  getProduct( idProduct);
        if(!Objects.isNull(product.getIdProduct())){
            product.setDescription(updateProductDO.getDescription());
            product.setModel(updateProductDO.getModel());
            repository.save(product);
            return true;
        }
        return false;
    }

    @Override
    public ProductDO getProductDetail(String idProduct){
        return mapper.ToProductDO(getProduct( idProduct));
    }

    private Product getProduct(String idProduct){
      return  repository.findByIdProduct(idProduct).orElseGet(() -> Product.builder().build());
    }
}
