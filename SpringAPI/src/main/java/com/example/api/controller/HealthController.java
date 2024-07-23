package com.example.api.controller;

import com.example.api.dto.HealthStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    private static final Logger logger = LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/health")
    public ResponseEntity<HealthStatus> health() {
        try {
            logger.info("Health check request received.");
            HealthStatus status = new HealthStatus("Service is running!", HttpStatus.OK.value());
            logger.info("Health check response: {}", status);
            return new ResponseEntity<>(status, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Health check failed.", e);
            HealthStatus status = new HealthStatus("Service is not available.", HttpStatus.INTERNAL_SERVER_ERROR.value());
            return new ResponseEntity<>(status, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
