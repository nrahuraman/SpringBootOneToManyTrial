package com.example.demo.dto;

import com.example.demo.entities.Customer;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

	private Customer customer;
	
}
