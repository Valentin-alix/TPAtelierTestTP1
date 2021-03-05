package com.example.TP1Test.Entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;



@Entity
@Data

public class User {
	@Id
	@GeneratedValue
	 private Long id;
	 private String firstname;
	 private String lastname;
	 @OneToMany
	 private List <Product> produits;
	 
	
	
}
