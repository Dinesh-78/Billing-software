package com.soft.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soft.billing.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
