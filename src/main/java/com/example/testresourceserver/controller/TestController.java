package com.example.testresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String[] getTests() {
        return new String[] { "Test 1", "Test 2", "Test 3" };
    }

}
