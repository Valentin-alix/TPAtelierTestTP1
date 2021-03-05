package com.example.TP1Test.jpaaccess;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.TP1Test.jpaaccess.Product;

@Entity
public class User {
	@Id
	@GeneratedValue
	 private Long id;
	 private String firstname;
	 private String lastname;
	 @OneToMany
	 private List <Product> produits;
	 
	public User(Long id, String firstname, String lastname, List<Product> produits) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.produits = produits;
	}

	public Long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public List<Product> getProduits() {
		return produits;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", produits=" + produits
				+ "]";
	}
	 
	
}
