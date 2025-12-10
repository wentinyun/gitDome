package com.wentingyun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomeTest {
    @GetMapping("/user")
    public void user(){
        System.out.println("user");
    }
}
