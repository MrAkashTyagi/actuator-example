package com.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBHealthService implements HealthIndicator {

    public static final String DB_SERVICE = "Database Service";

    public boolean isHealthGood() {
        //custom logic
        return false;
    }

    @Override
    public Health health() {

        if (isHealthGood()) {
            return Health.up().withDetail(DB_SERVICE, "Database Service is running").build();
        }

        return Health.down().withDetail(DB_SERVICE, "Databse service is running down").build();
    }
}
