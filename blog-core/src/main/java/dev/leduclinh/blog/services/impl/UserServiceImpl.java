package dev.leduclinh.blog.services.impl;

import dev.leduclinh.blog.domain.entities.UserEntity;
import dev.leduclinh.blog.domain.requests.UserLogin;
import dev.leduclinh.blog.domain.requests.UserRegister;
import dev.leduclinh.blog.domain.responses.UserInfo;
import dev.leduclinh.blog.repositories.UserRepository;
import dev.leduclinh.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public void registerUser(UserRegister userRegister) {
        UserEntity userEntity = new UserEntity(userRegister);
        userRepository.save(userEntity);
    }

    @Override
    public void loginUser(UserLogin request) {

    }

    @Override
    public void getInfoUser(UserInfo response) {

    }
}
