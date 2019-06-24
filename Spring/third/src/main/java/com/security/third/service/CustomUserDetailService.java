package com.security.third.service;

import com.security.third.domain.CustomUserDetail;
import com.security.third.domain.Users;
import com.security.third.repo.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserRepositry userRepositry;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> users = userRepositry.findByName(username);

        System.out.println(users);
        users.orElseThrow(() -> new UsernameNotFoundException("not found"));
        return users.map(CustomUserDetail::new).get();
    }
}
