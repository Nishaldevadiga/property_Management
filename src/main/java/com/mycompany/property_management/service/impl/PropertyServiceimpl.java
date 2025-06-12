package com.mycompany.property_management.service.impl;

import com.mycompany.property_management.convertor.PropertyConvertor;
import com.mycompany.property_management.dto.PropertyDTO;
import com.mycompany.property_management.entity.PropertyEntity;
import com.mycompany.property_management.repository.PropertyRepository;
import com.mycompany.property_management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceimpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private PropertyConvertor propertyConvertor;

    @Override

    public PropertyDTO saveproperty(PropertyDTO propertydto) {


        PropertyEntity pe = propertyConvertor.convertDTOEntity(propertydto);
        pe = propertyRepository.save(pe);
        propertydto = propertyConvertor.convertEntityToDTO(pe);

        return propertydto;
    }

    @Override
    public List<PropertyDTO> getAllproperties() {

        List<PropertyEntity> list = (List<PropertyEntity>) propertyRepository.findAll();
        List<PropertyDTO> plist = new ArrayList<>();
        for (PropertyEntity pe : list) {
            PropertyDTO po = propertyConvertor.convertEntityToDTO(pe);
            plist.add(po);
        }
        return plist;
    }

    @Override
    public PropertyDTO updateproperty(PropertyDTO propertydto, Long id) {
        Optional<PropertyEntity> opten = propertyRepository.findById(id);
        PropertyDTO propertyDTO = null;
        if (opten.isPresent()) {
            PropertyEntity pe = opten.get();
            pe.setTitle(propertydto.getTitle());
            pe.setAddress(propertydto.getAddress());
            pe.setDesc(propertydto.getDesc());
            pe.setOwneremail(propertydto.getOwneremail());
            pe.setOwnername(propertydto.getOwnername());
            pe.setPrice(propertydto.getPrice());
            propertyDTO = propertyConvertor.convertEntityToDTO(pe);
            propertyRepository.save(pe);
        }
        return propertyDTO;
    }

    @Override
    public PropertyDTO updatedesc(PropertyDTO propertydto, Long id) {
        Optional<PropertyEntity> opten = propertyRepository.findById(id);
        PropertyDTO propertyDTO = null;
        if (opten.isPresent()) {
            PropertyEntity pe = opten.get();
            pe.setDesc(propertydto.getDesc());
            propertyDTO = propertyConvertor.convertEntityToDTO(pe);
            propertyRepository.save(pe);
        }

        return propertyDTO;
    }

    @Override
    public PropertyDTO Delete(Long id) {
        Optional<PropertyEntity> opten = propertyRepository.findById(id);
        PropertyDTO propertyDTO = null;
        if (opten.isPresent()) {
            PropertyEntity pe = opten.get();
            propertyDTO = propertyConvertor.convertEntityToDTO(pe);
            propertyRepository.deleteById(id);
        }
        return propertyDTO;
    }
}
