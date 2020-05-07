package com.latihan.springsecurity.auth.repo;

import com.latihan.springsecurity.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
