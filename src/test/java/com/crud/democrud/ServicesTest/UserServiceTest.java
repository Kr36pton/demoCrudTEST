package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UserModel;
import com.crud.democrud.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import java.util.Optional;
import static  org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UserServiceTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testSaveUser(){
        UserModel userModel=new UserModel("aquaman","aqua@gmail.com",99);
        UserModel userModelRegistrado = userRepository.save(userModel);
        assertNotNull(userModelRegistrado);
    }

    @Test
    public void testBuscarUserById(){
        Long idSearch=1L;
        Optional<UserModel> userModelSearch=userRepository.findById(idSearch);
        assertThat(userModelSearch.get().getId()).isEqualTo(idSearch);
    }

    @Test
    public void testListarUsers(){
        List<UserModel> userModelList=(List<UserModel>) userRepository.findAll();
        assertThat(userModelList).size().isGreaterThan(0);
    }

    @Test
    public void testGetUserByPriority(){
        Long priority=3L;
        Optional<UserModel> userModelSearch=userRepository.findById(priority);
        assertThat(userModelSearch.get().getId()).isEqualTo(priority);
    }
}