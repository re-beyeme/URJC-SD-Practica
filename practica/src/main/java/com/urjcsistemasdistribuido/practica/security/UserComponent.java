package com.urjcsistemasdistribuido.practica.security;

import com.urjcsistemasdistribuido.practica.model_data.entities.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class UserComponent {
    private UserEntity user;

    public UserEntity getLoggedUser() {
        return user;
    }

    public void setLoggedUser(UserEntity user) {
        this.user = user;
    }

    public boolean isLoggedUser() {
        return this.user != null;
    }
}
