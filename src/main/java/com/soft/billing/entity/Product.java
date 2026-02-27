package com.soft.billing.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "products")
@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "product_name", nullable = false, length = 100)
	private String productName;

	@Column(name = "selling_price", nullable = false, precision = 10, scale = 2)
	private BigDecimal productPrice; // Selling Price

	@Column(name = "mrp", nullable = false, precision = 10, scale = 2)
	private BigDecimal productMrp;

	@Column(name = "gst_rate", nullable = false)
	private double gstRate; // Percentage

	@Column(name = "quantity", nullable = false)
	private int productQuantity;

	@Column(name = "category", length = 50)
	private String category;
}
