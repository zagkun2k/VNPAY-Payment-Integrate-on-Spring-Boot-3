package com.truonggiang.vnpay.service;

import com.truonggiang.vnpay.model.OrderRequestDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderPaymentService {
    public Map<String, Object> createOrder(OrderRequestDTO orderRequestDTO) {

        return new HashMap<>();
    }
}
