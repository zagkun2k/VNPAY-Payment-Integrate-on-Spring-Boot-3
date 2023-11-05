package com.truonggiang.vnpay.controller;

import com.truonggiang.vnpay.model.OrderRequestDTO;
import com.truonggiang.vnpay.service.OrderPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderPaymentController {

    @Autowired
    private OrderPaymentService orderPaymentService;

    @PostMapping("/api/v1/create-order")
    public ResponseEntity<Map<String, Object>> createOrderPayment(@RequestBody OrderRequestDTO orderRequestDTO) {

        Map<String, Object> result = this.orderPaymentService.createOrder(orderRequestDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
