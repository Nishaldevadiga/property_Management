package com.mycompany.property_management.controller;

import com.mycompany.property_management.dto.PropertyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {


    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

//localhost:8080/api/v1/saveproperty
    @PostMapping("/saveproperty")
    public PropertyDTO saveproperty(@RequestBody PropertyDTO propertydto){
         System.out.print(propertydto);
         return propertydto;
    }
}
