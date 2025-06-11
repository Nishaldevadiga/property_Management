package com.mycompany.property_management.service.impl;

import com.mycompany.property_management.convertor.PropertyConvertor;
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

    @Autowired
    private PropertyConvertor propertyConvertor;

    @Override

    public PropertyDTO saveproperty(PropertyDTO propertydto) {


         PropertyEntity pe=propertyConvertor.convertDTOEntity(propertydto);
        propertyRepository.save(pe);
        return null;
    }
}
