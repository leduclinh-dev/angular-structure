package dev.leduclinh.cdbusiness.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String username;

    private String phone;

    private String address;

    private String role;

    private String authorities;

    private String password;
}
