package com.example.demo.repository;

import com.example.demo.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser,Long> {
    AppUser findAppUserByName(String name);
}
