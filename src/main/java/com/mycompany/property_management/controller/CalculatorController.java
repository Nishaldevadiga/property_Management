package com.mycompany.property_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/calculator")
public class CalculatorController {
    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam
            ("num2")Double num2){
       return num1+num2;
    }
}
