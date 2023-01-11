package ru.otr.sbkeycloak.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTestController {

    @GetMapping( "/customers")
    public String customers() {
        return "customers";
    }
}
