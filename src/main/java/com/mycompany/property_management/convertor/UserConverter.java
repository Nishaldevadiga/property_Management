package com.mycompany.property_management.convertor;

import com.mycompany.property_management.dto.UserDTO;
import com.mycompany.property_management.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity convertDTOtoEntity(UserDTO userDTO){
             UserEntity userEntity=new UserEntity();
             userEntity.setOwneremail(userDTO.getOwneremail());
             userEntity.setOwnername(userDTO.getOwnername());
             userEntity.setPhone(userDTO.getPhone());
             userEntity.setPassword(userDTO.getPassword());
             return userEntity;
    }

    public UserDTO convertEntityToDTo(UserEntity userEntity){
        UserDTO userDTO=new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setOwneremail(userEntity.getOwneremail());
        userDTO.setOwnername(userEntity.getOwnername());
        userDTO.setPhone(userEntity.getPhone());


        return userDTO;
    }
}
