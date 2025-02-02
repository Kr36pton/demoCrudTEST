package com.crud.democrud.controllers;
import com.crud.democrud.models.UserModel;
import com.crud.democrud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping()
    public ArrayList<UserModel> getUsers() {
        return userService.getUsers();
    }
    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id) {
        return this.userService.getById(id);
    }
    @GetMapping("/query")
    public ArrayList<UserModel> getUserByPriority(@RequestParam("priority") Integer priority) {
        return this.userService.getByPriority(priority);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.userService.deleteUser(id);
        if (ok) {
            return "Se eliminó el user con id " + id;
        } else {
            return "No pudo delete el user con id" + id;
        }
    }

    @PutMapping (path = "/updateUser")
    public UserModel updateUser(@RequestBody UserModel user){
        return this.userService.updateUser(user);
    }
}