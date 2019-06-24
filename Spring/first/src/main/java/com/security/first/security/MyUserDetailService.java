package com.security.first.security;

import com.security.first.domin.User;
import com.security.first.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        User user = userRepository.findByName(username);
//        if (user == null)
//            throw new UsernameNotFoundException("user 404");
        return new UserPrinciple(null);
    }
}
