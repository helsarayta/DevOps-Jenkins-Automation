package com.heydie.devopsjenkinsautomation;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsJenkinsAutomationApplication {
    Logger log = org.slf4j.LoggerFactory.getLogger(DevOpsJenkinsAutomationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DevOpsJenkinsAutomationApplication.class, args);
    }

    @GetMapping
    public String getWelcomeMessage() {
        log.info("LOG {}","LOG Welcome to DevOps Jenkins Automation Project");
        return "Welcome to DevOps Jenkins Automation Project";

    }

}
