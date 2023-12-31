package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.OrderResponse;
import com.example.demo.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	@Query("Select new com.example.demo.dto.OrderResponse (c.name , p.productName) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();

}
