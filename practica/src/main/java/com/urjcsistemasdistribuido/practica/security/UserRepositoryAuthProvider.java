package com.urjcsistemasdistribuido.practica.security;

import com.urjcsistemasdistribuido.practica.model_data.entities.User;
import com.urjcsistemasdistribuido.practica.repository.user.UserRepository;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepositoryAuthProvider  implements AuthenticationProvider {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserComponent userComponent;

    /**
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        User user = userRepository.findByUserName(username);

        if (user == null) {
            throw new BadCredentialsException("User not found");
        }

        if (!new BCryptPasswordEncoder().matches(password, user.getPassword())) {

            throw new BadCredentialsException("Wrong password");
        } else {

            userComponent.setLoggedUser(user);

            List<GrantedAuthority> roles = new ArrayList<>();
            for (String role : user.getRoles()) {
                roles.add(new SimpleGrantedAuthority(role));
            }

            return new UsernamePasswordAuthenticationToken(username, password, roles);
        }
    }

    /**
     * @param
     * @return
     */
    @Override
    public boolean supports(Class<?> authenticationObject) {
        return true;
    }
}
