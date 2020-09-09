package dev.leduclinh.blog.security;

import dev.leduclinh.blog.domain.entities.UserEntity;
import dev.leduclinh.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findAllByUsername(username);
        if (user == null) { throw new UsernameNotFoundException(username); }
        List<GrantedAuthority> authorities = new ArrayList<>();
        if (user.getAuthorities() != null) {
            String[] authors = user.getAuthorities().split(";");
            for (String authority: authors) {
                authorities.add(new SimpleGrantedAuthority("ROLE_" + authority));
            }
        }
        MyUserDetail loginUser = new MyUserDetail(user.getUsername(), user.getPassword(), true, true, true, true, authorities);
        loginUser.setId(user.getId());
        loginUser.setUsername(user.getUsername());
        loginUser.setRole(user.getRole());
        loginUser.setEmail(user.getEmail());
        return loginUser;
    }
}
