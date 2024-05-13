package com.abdullah.coding.challenge.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    
    @Column(name = "name")
    String name;
    
    @Column(name = "status")	
    String status;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
}
