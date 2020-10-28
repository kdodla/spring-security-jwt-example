package com.javatechie.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.jwt.api.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
