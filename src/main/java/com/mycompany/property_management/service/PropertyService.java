package com.mycompany.property_management.service;

import com.mycompany.property_management.dto.PropertyDTO;

import java.util.List;

public interface PropertyService {
    public PropertyDTO saveproperty(PropertyDTO propertydto);
    public List<PropertyDTO> getAllproperties();
    public PropertyDTO updateproperty(PropertyDTO propertyDTO, Long id);
    public PropertyDTO updatedesc(PropertyDTO propertyDTO, Long id);
    public PropertyDTO Delete(Long id);

}
