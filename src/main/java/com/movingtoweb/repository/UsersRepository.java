package com.movingtoweb.repository;

import com.movingtoweb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findByName(String name);
}
