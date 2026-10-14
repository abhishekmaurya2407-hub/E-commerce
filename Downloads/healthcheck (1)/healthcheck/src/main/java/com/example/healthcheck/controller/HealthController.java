
package com.example.healthcheck.controller;

import com.example.healthcheck.dto.response.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

/**
 * Exposes HTTP endpoints for checking application health.
 */
@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    /**
     * Returns the current health status of the application.
     *
     * @return HTTP 200 with the health response as JSON.
     */
    @GetMapping
    public ResponseEntity<HealthResponse> checkHealth() {

        HealthResponse response = new HealthResponse(
                "UP",
                "healthcheck",
                Instant.now()
        );

        return ResponseEntity.ok(response);
    }
}
