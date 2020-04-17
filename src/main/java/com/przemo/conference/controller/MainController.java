package com.przemo.conference.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class MainController {
    @GetMapping("/")
    public String greet(Model model) {
        return ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Warsaw")).toString();
    }
}
