package com.aws.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.ZoneId;

import static java.lang.String.format;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return format("Greetings from the AWS! The current date-time is: '%s'.",
                Instant.now().atZone(ZoneId.of("America/Los_Angeles")).toString());
    }
    
    
    @RequestMapping("/health-check")
    public String healthCheck() {
        return format("health-check is successful: '%s'.",
                Instant.now().atZone(ZoneId.of("America/Los_Angeles")).toString());
    }
}
