package com.truonggiang.vnpay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CallbackPaymentController {

    @GetMapping("/api/v1/callback")
    public ResponseEntity<Map<String, Object>> doCallBack(@RequestParam Map<String, Object> callBackInfo) {

        System.out.println(callBackInfo);
        return new ResponseEntity<>(new HashMap<>(), HttpStatus.OK);
    }
}
