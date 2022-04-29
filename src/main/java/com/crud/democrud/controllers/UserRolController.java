package com.crud.democrud.controllers;

import com.crud.democrud.models.UserRolModel;
import com.crud.democrud.services.UserRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/rolUser")
public class UserRolController {
    @Autowired
    UserRolService userRolService;

    @GetMapping()
    public ArrayList<UserRolModel> getRolUser(){
        return userRolService.getRolUser();
    }

    @PostMapping()
    public UserRolModel saveRolUser(@RequestBody UserRolModel rol){
        return this.userRolService.saveRolUser(rol);
    }

    @GetMapping(path = "/{id_rol}")
    public Optional<UserRolModel> findRolId(@PathVariable("id_rol") Long id_rol){
        return this.userRolService.findRolId(id_rol);
    }

    @DeleteMapping(path = "{id_rol}")
    public String deleteRolUser(@PathVariable("id_rol") Long id_rol){
        boolean ok = this.userRolService.deleteRolUser(id_rol);
        if (ok){
            return "Se eliminó el rol con id: " + id_rol;
        }else {
            return "No pudo eliminarse el rol con id: " + id_rol;
        }
    }

    @PutMapping(path = "/actualizarRol")
    public UserRolModel actualizarRolUser(@RequestBody UserRolModel rol){
        return this.userRolService.actualizarRolUser(rol);
    }
}