package com.przemo.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;


@Controller
public class GreetingController {

    @GetMapping("/greeting/{id}")
    public String greet(Model model, @PathVariable Integer id) {
        model.addAttribute("serverTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Warsaw")).toString() + " id: " + id);

        return "index.html";
    }
}
