package com.pdev.rempms.candidateservice;

import com.pdev.rempms.candidateservice.dto.configurationDTO.DatabaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableConfigurationProperties(value = {DatabaseConfig.class})
public class CandidateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidateServiceApplication.class, args);
    }

}
