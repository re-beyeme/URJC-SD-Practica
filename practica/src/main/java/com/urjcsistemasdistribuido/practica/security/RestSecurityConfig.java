package com.urjcsistemasdistribuido.practica.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(1)
public class  RestSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public UserRepositoryAuthProvider userRepoAuthProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.antMatcher("/api/**");

        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/logIn").authenticated();

        // URLs that need authentication to access to it
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/equipo/").hasRole("USER");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/partido/").hasRole("USER");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/calendario/").hasRole("USER");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/torneo/").hasRole("USER");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/jugador/").hasRole("USER");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/mercado/").hasRole("USER");
        http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/clasificacion/").hasRole("USER");

        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/equipo/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/equipo/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/equipo/**").hasRole("ADMIN");

        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/partido/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/partido/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/partido/**").hasRole("ADMIN");

        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/calendario/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/calendario/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/calendario/**").hasRole("ADMIN");

        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/torneo/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/torneo/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/torneo/**").hasRole("ADMIN");

        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/jugador/").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/jugador/").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/jugador/").hasRole("ADMIN");

        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/mercado/").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/mercado/").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/mercado/").hasRole("ADMIN");

        http.authorizeRequests().antMatchers(HttpMethod.POST, "/api/clasificacion/").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/clasificacion/").hasRole("ADMIN");
        http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/clasificacion/").hasRole("ADMIN");


        // Other URLs can be accessed without authentication
        http.authorizeRequests().anyRequest().permitAll();

        // Disable CSRF protection (it is difficult to implement in REST APIs)
        http.csrf().disable();

        // Use Http Basic Authentication
        http.httpBasic();

        // Do not redirect when logout
        http.logout().logoutSuccessHandler((rq, rs, a) -> {	});
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // Database authentication provider
        auth.authenticationProvider(userRepoAuthProvider);
    }
}
