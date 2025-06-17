package com.mycompany.property_management.controller;

import com.mycompany.property_management.dto.PropertyDTO;
import com.mycompany.property_management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PropertyController {
    @Value("${pms.dummy}")
    private String dummy;

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/getproperties")
     public ResponseEntity<List<PropertyDTO>>  getAllProperties(){
        System.out.println(dummy);
        List<PropertyDTO> li=propertyService.getAllproperties();
        ResponseEntity<List<PropertyDTO>> res=new ResponseEntity<List<PropertyDTO>>(li,HttpStatus.OK);
        return res;

    }



//localhost:8080/api/v1/saveproperty
    @PostMapping("/saveproperty")
    public ResponseEntity<PropertyDTO> saveproperty(@RequestBody PropertyDTO propertydto){
        propertydto=propertyService.saveproperty(propertydto);
        ResponseEntity<PropertyDTO> res=new ResponseEntity<PropertyDTO>(propertydto, HttpStatus.CREATED);
         return res;
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<PropertyDTO> Updateproperty(@RequestBody PropertyDTO propertydto,@PathVariable Long id){

        propertydto=propertyService.updateproperty(propertydto,id);
        ResponseEntity<PropertyDTO> res=new ResponseEntity<PropertyDTO>(propertydto, HttpStatus.CREATED);
        return res;


    }
    @PatchMapping("/patchdesc/{id}")
    public ResponseEntity<PropertyDTO>  updatedesc(@RequestBody PropertyDTO propertydto,@PathVariable Long id){

        propertydto=propertyService.updatedesc(propertydto,id);
        ResponseEntity<PropertyDTO> res=new ResponseEntity<PropertyDTO>(propertydto, HttpStatus.CREATED);
        return res;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PropertyDTO> Delete(@PathVariable Long id){
        PropertyDTO propertydto=propertyService.Delete(id);
        ResponseEntity<PropertyDTO> res=new ResponseEntity<PropertyDTO>(propertydto, HttpStatus.OK);
        return res;
    }
}
