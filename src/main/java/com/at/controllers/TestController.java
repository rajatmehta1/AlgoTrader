package com.at.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/trader/hello")
    public String helloTrader() {
        return "hellow trader";
    }

}
