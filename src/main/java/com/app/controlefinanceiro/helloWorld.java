package com.app.controlefinanceiro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloWorld")
public class helloWorld {

    @GetMapping
    public String helloWorld () {
        return "Hello World";
    }
}
