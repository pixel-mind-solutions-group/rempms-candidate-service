package com.pdev.rempms.candidateservice.controller.config;

import com.pdev.rempms.candidateservice.dto.configurationDTO.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eazy Bytes
 */
@RestController
@RequestMapping(path = "/api/candidate/config", produces = {MediaType.APPLICATION_JSON_VALUE})
@Validated
public class ConfigController {

    @Autowired
    private DatabaseConfig databaseConfig;

    @GetMapping("/database-info")
    public ResponseEntity<DatabaseConfig> getDataBaseInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(databaseConfig);
    }
}
