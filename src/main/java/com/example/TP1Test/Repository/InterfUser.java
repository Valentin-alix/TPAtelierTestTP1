package com.example.TP1Test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TP1Test.Entities.User;

public interface InterfUser extends JpaRepository<User, Long> {

  List<User> findByLastname(String lastname);

  User findById(long id);
}
