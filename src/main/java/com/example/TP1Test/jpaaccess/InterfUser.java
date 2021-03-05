package com.example.TP1Test.jpaaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfUser extends JpaRepository<User, Long> {

  List<User> findByLastname(String lastname);

  User findById(long id);
}
