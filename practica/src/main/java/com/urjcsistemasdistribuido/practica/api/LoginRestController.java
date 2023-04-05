package com.urjcsistemasdistribuido.practica.api;

import com.urjcsistemasdistribuido.practica.model_data.entities.UserEntity;
import com.urjcsistemasdistribuido.practica.security.UserComponent;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginRestController {

    private static final Logger log = LoggerFactory.getLogger(LoginRestController.class);

    @Autowired
    private UserComponent userComponent;

    @RequestMapping("/api/logIn")
    public ResponseEntity<UserEntity> logIn() {

        if (!userComponent.isLoggedUser()) {
            log.info("Not user logged");
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        } else {
            UserEntity loggedUser = userComponent.getLoggedUser();
            log.info("Logged as " + loggedUser.getUserName());
            return new ResponseEntity<>(loggedUser, HttpStatus.OK);
        }
    }

    @RequestMapping("/api/logOut")
    public ResponseEntity<Boolean> logOut(HttpSession session) {

        if (!userComponent.isLoggedUser()) {
            log.info("No user logged");
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        } else {
            session.invalidate();
            log.info("Logged out");
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
    }
}
