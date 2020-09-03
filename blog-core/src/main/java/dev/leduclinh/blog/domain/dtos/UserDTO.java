package dev.leduclinh.blog.domain.dtos;

import dev.leduclinh.blog.domain.entities.UserEntity;

import java.sql.Timestamp;

public class UserDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;
    private Timestamp birthday;
    private String role;
    private String phone;

    public UserDTO() {}

}
