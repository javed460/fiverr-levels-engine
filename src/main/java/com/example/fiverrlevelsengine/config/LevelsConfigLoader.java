package com.example.fiverrlevelsengine.config;

import com.example.fiverrlevelsengine.domain.Levels;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

@Configuration
public class LevelsConfigLoader {

    @Bean
    public Levels levels() {
        InputStream inputStream = getClass().getResourceAsStream("/levels-config.yml");
        Yaml yaml = new Yaml();
        return yaml.loadAs(inputStream, Levels.class);
    }
}