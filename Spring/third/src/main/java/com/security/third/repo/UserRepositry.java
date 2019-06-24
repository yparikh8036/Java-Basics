package com.security.third.repo;

import com.security.third.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositry extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
