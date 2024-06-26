package com.process.shop.repository;

import com.process.shop.model.User;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findByBirthDay(LocalDate birthDay);
    //SELECT * FROM users WHERE email = "dsdsds" AND id != 2
    Optional<User> findByEmailAndIdNot(String email, Long id);
}
