package com.process.shop.service;

import com.process.shop.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User createUser(User user);
    User updateUser(User user, Long id);
    User getUserById(Long id);
    List<User> findAllUsers();

}
