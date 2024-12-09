package com.at.controllers;

import com.at.entity.Test;
import com.at.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/trader/hello")
    public String helloTrader() {
        return "hellow trader";
    }

    @GetMapping("/trader/tests")
    public List<Test> tests() {
        return testRepository.findAll();
    }

}
