package com.example.TP1Test.jpaaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfProduct extends JpaRepository<Product, Long> {

	  List<Product> findByname(String name);

	  User findById(long id);
	}