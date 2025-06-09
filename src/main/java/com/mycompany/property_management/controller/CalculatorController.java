package com.mycompany.property_management.controller;

import org.springframework.web.bind.annotation.*;

//http://localhost:8080/api/vi/calculator/add/4?num1=3&num2=4
@RestController
@RequestMapping("/api/vi/calculator")
public class CalculatorController {
    @GetMapping("/add/{num3}")
    public Double add(@RequestParam("num1") Double num1, @RequestParam
            ("num2")Double num2,@PathVariable("num3") Double num3){
       return num1+num2+num3;
    }
    //http://localhost:8080/api/vi/calculator/sub/6.0/3.0
    @GetMapping("/sub/{num1}/{num2}")
    public Double sub(@PathVariable("num1") Double num1, @PathVariable
            ("num2")Double num2){
        return num1-num2;
    }
}
