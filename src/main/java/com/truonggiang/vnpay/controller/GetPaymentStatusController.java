package com.truonggiang.vnpay.controller;

import com.truonggiang.vnpay.model.StatusRequestDTO;
import com.truonggiang.vnpay.service.GetPaymentStatusService;
import com.truonggiang.vnpay.service.OrderPaymentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GetPaymentStatusController {

    @Autowired
    private GetPaymentStatusService getPaymentStatusService;

    @PostMapping("/api/v1/get-status")
    public ResponseEntity<Map<String, Object>> getStatus(HttpServletRequest request, @RequestBody StatusRequestDTO statusRequestDTO) throws IOException {

        Map<String, Object> result = this.getPaymentStatusService.getStatus(request, statusRequestDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
