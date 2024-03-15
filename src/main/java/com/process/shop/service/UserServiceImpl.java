package com.process.shop.service;

import com.process.shop.model.Address;
import com.process.shop.model.User;
import com.process.shop.model.enums.DocumentType;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, Long id) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return User.builder()
                .fullName("Pepito Perez")
                .document("123")
                .documentType(DocumentType.CC)
                .address(List.of(
                        Address.builder()
                        .street("circunvalar")
                        .avenue("1212")
                        .neighborhood("12345")
                        .postalCode("203040")
                        .build()))
                .password("admin")
                .phoneNumber("3125487")
                .birthDay(new Date())
                .email("mail@email.com")
                .build();

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
