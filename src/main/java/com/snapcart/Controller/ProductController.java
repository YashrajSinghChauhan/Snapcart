package com.snapcart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snapcart.Entity.Product;
import com.snapcart.Services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	 @Autowired
	 private ProductService productService;
	@GetMapping("/all")
	public List<Product> getAllProducts()
	{
		return productService.getLoadAllProducts();
	}
}
