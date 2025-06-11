package com.mycompany.property_management.convertor;

import com.mycompany.property_management.dto.PropertyDTO;
import com.mycompany.property_management.entity.PropertyEntity;
import org.springframework.stereotype.Component;
import com.mycompany.property_management.dto.PropertyDTO;


@Component
public class PropertyConvertor {

    public PropertyEntity convertDTOEntity(PropertyDTO propertydto){
        PropertyEntity pe=new PropertyEntity();
        pe.setTitle(propertydto.getTitle());
        pe.setAddress(propertydto.getAddress());
        pe.setDesc(propertydto.getDesc());
        pe.setOwneremail(propertydto.getOwneremail());
        pe.setOwnername(propertydto.getOwnername());
        pe.setPrice(propertydto.getPrice());
        return pe;
    }
}
