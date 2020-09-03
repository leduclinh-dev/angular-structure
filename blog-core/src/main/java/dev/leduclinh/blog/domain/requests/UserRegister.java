package dev.leduclinh.blog.domain.requests;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class UserRegister {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;
    private Timestamp birthday;
    private String phone;
}
