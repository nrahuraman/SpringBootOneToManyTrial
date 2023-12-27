package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
	
	@Id
	private int pid;
	private String productName;
	private int qty;
	private int price;
	

}
