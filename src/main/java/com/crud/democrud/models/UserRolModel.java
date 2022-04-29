package com.crud.democrud.models;

import javax.persistence.*;

@Entity
@Table(name = "UserRol")
public class UserRolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_Rol;

    private String rol;

    public UserRolModel() {
    }

    public UserRolModel(String rol) {
        this.rol = rol;
    }

    public Long getId_Rol() {
        return id_Rol;
    }

    public void setId_Rol(Long id_Rol) {
        this.id_Rol = id_Rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}