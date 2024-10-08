package com.bussiness.product.server.controller;

import com.bussiness.product.constants.Constants;
import com.bussiness.product.server.controller.mapper.ProductMapper;
import com.bussiness.product.server.controller.request.ProductRequest;
import com.bussiness.product.server.controller.request.UpdateProductRequest;
import com.bussiness.product.server.controller.response.ProductResponse;
import com.bussiness.product.server.controller.response.ResponseCallback;
import com.bussiness.product.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product/")
public class ProductRestController {

    private final ProductService service;
    private final ProductMapper mapper;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseCallback createProduct(
            @Valid @RequestBody ProductRequest request)
            throws JsonProcessingException {

        service.createProduct(mapper.productRequestToDO(request));
        return getResponseCallback(Constants.STR_SUCCESS_CODE,Constants.STR_SUCCESS_MESSAGE);

    }

    @PutMapping("/update/{idProduct}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseCallback updateProduct(@PathVariable String idProduct,
            @Valid @RequestBody UpdateProductRequest request)
            throws JsonProcessingException {
        boolean result = service.updateProduct(idProduct,mapper.updateProductRequestToDO(request));
        if(result){
            return getResponseCallback(Constants.STR_SUCCESS_CODE_UPDATE,Constants.STR_SUCCESS_MESSAGE_UPDATE);
        }
        else{
            return getResponseCallback(Constants.STR_FAILED_CODE_UPDATE,Constants.STR_FAILED_MESSAGE_UPDATE);
        }
    }

    @getMapping("/update/{idProduct}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ProductResponse getProductDetail(@PathVariable String idProduct)
            throws JsonProcessingException {
         return mapper.productDOToResponse(service.getProductDetail(idProduct));
    }


    private ResponseCallback getResponseCallback(String code,String message){
        return ResponseCallback.builder().code(code).message(message).timestamp(LocalDate.now()).build();
    }

}
