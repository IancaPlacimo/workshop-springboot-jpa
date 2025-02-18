package com.iancaplacimo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iancaplacimo.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

	
}
