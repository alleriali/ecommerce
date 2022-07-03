package com.yingscode.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yingscode.ecommerce.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
