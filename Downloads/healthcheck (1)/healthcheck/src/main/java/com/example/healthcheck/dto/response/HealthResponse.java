
package com.example.healthcheck.dto.response;

import java.time.Instant;

/**
 * Defines the response structure for the health-check API.
 *
 * @param status    Current health status of the application.
 * @param service   Name of the application.
 * @param timestamp Time at which the response was generated.
 */
public record HealthResponse(
        String status,
        String service,
        Instant timestamp
) {
}
