package com.example.TP1Test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TP1Test.Entities.Product;
import com.example.TP1Test.Entities.User;

public interface InterfProduct extends JpaRepository<Product, Long> {

	  List<Product> findByname(String name);

	  User findById(long id);
	}