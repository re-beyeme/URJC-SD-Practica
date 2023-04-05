package com.urjcsistemasdistribuido.practica.service.impl;

import com.urjcsistemasdistribuido.practica.service.UserService;
import com.urjcsistemasdistribuido.practica.user.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    /**
     * @return
     */
    @Override
    public Page<User> getAllUser() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<User> getOneUserById(Long id) {
        return Optional.empty();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<User> getOneUserByName(String name) {
        return Optional.empty();
    }

    /**
     * @param user
     */
    @Override
    public void saveUser(User user) {

    }

    /**
     * @param id
     * @param user
     * @return
     */
    @Override
    public User modifyUser(Long id, User user) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteOneUserById(Long id) {

    }
}
