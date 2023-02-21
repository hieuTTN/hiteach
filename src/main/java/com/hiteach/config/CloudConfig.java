package com.hiteach.config;

import com.cloudinary.Cloudinary;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@SpringBootApplication
public class CloudConfig {
    @Bean
    public Cloudinary cloudinaryConfigs() {
        Cloudinary cloudinary = null;
        Map config = new HashMap();
        config.put("cloud_name", "dt2g4oabz");
        config.put("api_key", "141612778793448");
        config.put("api_secret", "kEpEX7dLHCy6jYuJMXr7xjN91Gc");
        cloudinary = new Cloudinary(config);
        return cloudinary;
    }
}
