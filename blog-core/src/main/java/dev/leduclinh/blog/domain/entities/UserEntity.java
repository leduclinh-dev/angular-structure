package dev.leduclinh.blog.domain.entities;

import dev.leduclinh.blog.domain.requests.UserRegister;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String username;
    private Timestamp birthday;
    private String facebookId;
    private String googleId;
    private String role;
    private Boolean passwordChanged;
    private String phone;
    private String authorities;

    public UserEntity(Long id) { this.id = id; }

    public UserEntity() {
    }

    public UserEntity(UserRegister userRegister) {
        this.firstname = userRegister.getFirstname();
        this.lastname = userRegister.getLastname();
        this.email = userRegister.getEmail();
        this.password = userRegister.getPassword();
        this.username = userRegister.getUsername();
        this.birthday = userRegister.getBirthday();
        this.phone = userRegister.getPhone();
    }
}
