package com.example.sbend2endaoolication.user;

import java.util.Collection;

public class User {
    private Long id;
    private String firstName;

    private String lastName;
    private String email;
    private String password;
    private boolean isEnabled = false;
    private Collection<Role> roles;


}
