package com.soft.billing.service;

import org.springframework.stereotype.Service;

import com.soft.billing.entity.Product;
import com.soft.billing.repository.ProductRepository;
import com.soft.billing.requestdto.ProductRequestDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	private ProductRepository productRepository;

	/**
	 * Save product.
	 *
	 * @param productRequestDTO the product request DTO
	 * @return the string
	 */
	public String saveProduct(ProductRequestDTO productRequestDTO) {
		Product product = new Product();
		product.setProductName(productRequestDTO.getProductName());
		product.setProductPrice(productRequestDTO.getProductPrice());
		product.setProductMrp(productRequestDTO.getProductMrp());
		product.setGstRate(productRequestDTO.getGstRate());
		product.setProductQuantity(productRequestDTO.getProductQuantity());
		product.setCategory(productRequestDTO.getCategory());
		productRepository.save(product);
		return product.getProductName() + " saved successfully with ID: " + product.getId();
	}
}
