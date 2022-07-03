package com.yingscode.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yingscode.ecommerce.dao.ProductRepository;
import com.yingscode.ecommerce.entity.Product;


@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("api/products")
	public List<Product> listProducts(){

		return productRepository.findAll();
	}
}
