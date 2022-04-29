package com.crud.democrud.models;
import javax.persistence.*;
@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String name;
    private String email;
    private Integer priority;

    //@ManyToOne(optional = false)
    //@JoinColumn(name = "id_role")
    //private UserRolModel role;

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public Integer getPriority() {
        return priority;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserModel(String name, String email, Integer priority) {
        this.name = name;
        this.email = email;
        this.priority = priority;
    }
    public UserModel() {

    }
}