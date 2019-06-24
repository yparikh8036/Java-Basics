package com.security.first.repository;

import com.security.first.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String username);
}
