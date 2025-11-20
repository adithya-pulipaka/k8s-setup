package com.adithyak.weather_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/")
    public String weather() {
        return "Hello there! The weather is beautiful today";
    }
}
