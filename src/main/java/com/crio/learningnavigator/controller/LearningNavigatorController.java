package com.crio.learningnavigator.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crio.learningnavigator.model.Exam;
import com.crio.learningnavigator.model.Student;
import com.crio.learningnavigator.model.Subject;
import com.crio.learningnavigator.service.LearningNavigatorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class LearningNavigatorController {

    @Autowired
    private LearningNavigatorService learningNavigatorService;

    @GetMapping("/check")
    public String getMethodName() {
        return "check working!";
    }

    @GetMapping("/hidden-feature/{number}")
    public ResponseEntity<String> getFact(@PathVariable(value = "number")String num) {
        RestTemplate restTemplate = new RestTemplate();
        String fact = restTemplate.getForObject("http://numbersapi.com/#"+num, String.class);
        return ResponseEntity.ok().body(fact);    
    }

    

    
    
    
    
}
