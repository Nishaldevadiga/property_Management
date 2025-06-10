package com.mycompany.property_management.service.impl;

import com.mycompany.property_management.dto.PropertyDTO;
import com.mycompany.property_management.entity.PropertyEntity;
import com.mycompany.property_management.repository.PropertyRepository;
import com.mycompany.property_management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceimpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    @Override

    public PropertyDTO saveproperty(PropertyDTO propertydto) {

        PropertyEntity pe=new PropertyEntity();
        pe.setTitle(propertydto.getTitle());
        pe.setAddress(propertydto.getAddress());
        pe.setDesc(propertydto.getDesc());
        pe.setOwneremail(propertydto.getOwneremail());
        pe.setOwnername(propertydto.getOwnername());
        pe.setPrice(propertydto.getPrice());

        propertyRepository.save(pe);
        return null;
    }
}
