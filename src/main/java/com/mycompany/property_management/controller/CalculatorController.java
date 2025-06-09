package com.mycompany.property_management.controller;

import com.mycompany.property_management.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    //http://localhost:8080/api/vi/calculator/mul
    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
Double result=null;
result=calculatorDTO.getNum1()*calculatorDTO.getNum2()*calculatorDTO.getNum3()*calculatorDTO.getNum4();
        ResponseEntity<Double> res=new ResponseEntity<Double>(result, HttpStatus.CREATED);
return res;
    }

}
