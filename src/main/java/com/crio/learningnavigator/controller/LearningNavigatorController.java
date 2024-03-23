package com.crio.learningnavigator.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LearningNavigatorController {

    @GetMapping("/check")
    public String getMethodName() {
        return "check working!";
    }
    
    
}
