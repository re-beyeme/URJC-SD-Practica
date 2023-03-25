package com.urjcsistemasdistribuido.practica.repository.user;

import com.urjcsistemasdistribuido.practica.model_data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository   extends JpaRepository<User, Long> {

    User findByUserName(String name);
}
