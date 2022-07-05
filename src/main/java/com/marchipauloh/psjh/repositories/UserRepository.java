package com.marchipauloh.psjh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marchipauloh.psjh.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
