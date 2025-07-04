package com.snapcart.utils;

import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.snapcart.Entity.Product;

public class ProductJsonLoadUtility {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductJsonLoadUtility.class);
    private static ProductJsonLoadUtility productUtil = null;
    private static List<Product> products = null;
	private ProductJsonLoadUtility() {
		// TODO Auto-generated constructor stub
	}
	public static ProductJsonLoadUtility getInstance()
	{
		if(null == productUtil)
		{
			return new ProductJsonLoadUtility();
		}
		return productUtil;
	}
    public static List<Product> loadAllProducts()
    {
    	ObjectMapper objectMapper = new ObjectMapper();
    	try {
    		products =objectMapper.readValue(new File("src/main/resources/products.json"),new  TypeReference<List<Product>>() {});
    		LOGGER.warn("Successfully Loaded Products");
    	} catch (Exception e) {
			LOGGER.error("Error in loading products ",e);
		}
    	return products;
    }
}
