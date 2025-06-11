package com.mycompany.property_management.controller;

import com.mycompany.property_management.dto.PropertyDTO;
import com.mycompany.property_management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {


    @Autowired
    private PropertyService propertyService;


    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

//localhost:8080/api/v1/saveproperty
    @PostMapping("/saveproperty")
    public ResponseEntity<PropertyDTO> saveproperty(@RequestBody PropertyDTO propertydto){
        propertydto=propertyService.saveproperty(propertydto);
        ResponseEntity<PropertyDTO> res=new ResponseEntity<PropertyDTO>(propertydto, HttpStatus.CREATED);
         return res;
    }
}
