package com.crud.democrud.models;

import javax.persistence.*;

@Entity
@Table(name = "UserRol")
public class UserRolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id_Rol;

    private Long id_User;
    private String rol;

    public Long getId_User() {
        return id_User;
    }

    public void setId_User(Long id_User) {
        this.id_User = id_User;
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