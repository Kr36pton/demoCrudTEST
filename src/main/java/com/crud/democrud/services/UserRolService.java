package com.crud.democrud.services;

import com.crud.democrud.models.UserRolModel;
import com.crud.democrud.repositories.UserRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserRolService {
    @Autowired
    UserRolRepository userRolRepository;

    public ArrayList<UserRolModel> getRolUser(){
        return (ArrayList<UserRolModel>) userRolRepository.findAll();
    }

    public UserRolModel saveRolUser(UserRolModel rol){
        return userRolRepository.save(rol);
    }

    public Optional<UserRolModel> findRolId(Long id_rol){
        return userRolRepository.findById(id_rol);
    }

    public boolean deleteRolUser(Long id_rol){
        try {
            userRolRepository.deleteById(id_rol);
            return true;
        } catch (Exception err){
            return false;
        }
    }

    public UserRolModel actualizarRolUser(UserRolModel rol){
        return userRolRepository.save(rol);
    }
}