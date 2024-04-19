package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IbraApplication {

    private static final Logger logger = LoggerFactory.getLogger(IbraApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(IbraApplication.class, args);
        logger.info("IbraApplication started at http://localhost:8081/hello");
    }
    
    @RestController
    @RequestMapping("/glsi_student_name")
    static class WorkController {
        @Value("${fullname:Ibrahima Ndendé Sow}")
        private String fullname;

        @GetMapping
        String getFullname() {
            return "Work done by " + this.fullname + "!";
        }
    }
}
