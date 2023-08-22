package com.example.sbend2endaoolication.user;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    private Long id;
    private String firstName;

    private String lastName;
    private String email;
    private String password;
    private boolean isEnabled = false;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Role> roles;


}
