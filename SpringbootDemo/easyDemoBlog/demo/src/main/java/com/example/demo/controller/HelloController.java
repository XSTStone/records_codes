package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author stone
 */

@RestController
@RequestMapping("/user")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Catch request");
        return "Easy demo for running jar via docker in server.";
    }
}
