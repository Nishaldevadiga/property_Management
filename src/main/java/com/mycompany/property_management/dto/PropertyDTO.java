package com.mycompany.property_management.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PropertyDTO {
    private String title;
    private String desc;
    private String ownername;
    private String owneremail;
    private double price;
    private String Address;

}
