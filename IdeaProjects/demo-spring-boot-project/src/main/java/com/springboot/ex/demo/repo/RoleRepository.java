package com.springboot.ex.demo.repo;

import com.springboot.ex.demo.model.ERole;
import com.springboot.ex.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
