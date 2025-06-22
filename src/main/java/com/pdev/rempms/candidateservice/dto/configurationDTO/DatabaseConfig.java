package com.pdev.rempms.candidateservice.dto.configurationDTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Record class to hold contact information for accounts. As a data carrier
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.datasource")
public class DatabaseConfig {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
