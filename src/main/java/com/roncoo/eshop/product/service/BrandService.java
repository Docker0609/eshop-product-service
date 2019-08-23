package com.roncoo.eshop.product.service;

import com.roncoo.eshop.product.model.Brand;

public interface BrandService {
	
	public void add(Brand brand , String operationType);
	
	public void update(Brand brand, String operationType);
	
	public void delete(Long id , String operationType);
	
	public Brand findById(Long id);
	
}
