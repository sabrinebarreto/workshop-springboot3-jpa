package com.training.Course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
