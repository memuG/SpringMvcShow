package com.przemo.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;


@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greet(Model model) {
        model.addAttribute("serverTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Warsaw")));

        return "index.html";
    }
}
