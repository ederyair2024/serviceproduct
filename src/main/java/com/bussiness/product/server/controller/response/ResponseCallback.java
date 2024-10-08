package com.bussiness.product.server.controller.response;

import com.google.type.DateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseCallback {
    private String code;
    private String message;
    private DateTime timestamp;

}
