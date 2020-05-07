package com.latihan.springsecurity.auth.repo;

import com.latihan.springsecurity.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
