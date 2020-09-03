package dev.leduclinh.blog.services;

import dev.leduclinh.blog.domain.requests.UserLogin;
import dev.leduclinh.blog.domain.requests.UserRegister;
import dev.leduclinh.blog.domain.responses.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void registerUser(UserRegister request);
    void loginUser(UserLogin request);
    void getInfoUser(UserInfo response);
}
