package com.todolist.todolist.repository;

import com.todolist.todolist.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepo;

    @Test
    void saveUserTest(){
        User user = new User();
        user.setId(1);
        user.setName("zeynep");
        user.setUserName("zey");
        user.setLastName("yıldırım");
        user.setEmail("zeynep@gmail.com");
        user.setPassword("zeynep");
        User response = userRepo.save(user); // Act
        assertEquals("Saved user test succesfully", response);// Assert
    }

}
