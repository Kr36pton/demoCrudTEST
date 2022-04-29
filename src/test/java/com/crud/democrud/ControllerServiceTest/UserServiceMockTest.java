package com.crud.democrud.ControllerServiceTest;

import com.crud.democrud.repositories.UserRepository;
import com.crud.democrud.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserServiceMockTest {
  @MockBean
  UserRepository userRepository;
  @Autowired
  UserService userService;
  @Test
  public void testUserMock(){
    when(userRepository.findAll()).thenReturn(new ArrayList<>());
    assertThat(userService.getUsers()).isEmpty();
    verify(userRepository).findAll();
  }
}