package com.urjcsistemasdistribuido.practica.repository;

import com.urjcsistemasdistribuido.practica.model_data.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository   extends JpaRepository<UserEntity, Long> {

    UserEntity findByUserName(String name);
}
