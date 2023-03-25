package com.urjcsistemasdistribuido.practica.user;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import lombok.*;

import java.util.List;

@Getter
@Setter@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserDto {

    private String userName;

    private String password;

    @ElementCollection(fetch= FetchType.EAGER)
    private List<String> roles;


}
