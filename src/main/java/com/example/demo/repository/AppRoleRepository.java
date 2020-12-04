package com.example.demo.repository;

import com.example.demo.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.security.acl.LastOwnerException;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
}
