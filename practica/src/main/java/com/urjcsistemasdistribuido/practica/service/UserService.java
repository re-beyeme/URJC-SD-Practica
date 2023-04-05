package com.urjcsistemasdistribuido.practica.service;

import com.urjcsistemasdistribuido.practica.user.User;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface UserService {

    Page<User> getAllUser();

    Optional<User> getOneUserById(Long id);

    Optional<User> getOneUserByName(String name);

    void saveUser(User user);

    User modifyUser(Long id, User user);

    void deleteOneUserById(Long id);
}
