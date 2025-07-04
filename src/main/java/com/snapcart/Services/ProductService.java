package com.snapcart.Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.snapcart.Entity.Product;
import com.snapcart.utils.ProductJsonLoadUtility;

@Service
public class ProductService {

	public ProductService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Product> getLoadAllProducts()
	{
		return  Arrays.asList(
	            new Product(101L, "Laptop", "14-inch Intel i7", 899.99),
	            new Product(102L, "Smartphone", "5G Android phone", 599.99),
	            new Product(103L, "Headphones", "Noise-cancelling over-ear", 199.95),
	            new Product(104L, "Monitor", "27-inch 4K UHD", 329.99),
	            new Product(105L, "Keyboard", "Mechanical RGB keyboard", 89.99),
	            new Product(106L, "Mouse", "Wireless optical mouse", 49.99),
	            new Product(107L, "Printer", "All-in-one color printer", 159.99),
	            new Product(108L, "Router", "Wi-Fi 6 dual-band router", 129.95),
	            new Product(109L, "External Hard Drive", "1TB USB 3.0", 74.50),
	            new Product(110L, "Webcam", "1080p HD webcam", 59.00),
	            new Product(111L, "Microphone", "USB condenser mic", 99.99),
	            new Product(112L, "Desk Lamp", "LED adjustable desk lamp", 29.99),
	            new Product(113L, "Gaming Chair", "Ergonomic with lumbar support", 189.99),
	            new Product(114L, "Tablet", "10-inch Android tablet", 249.99),
	            new Product(115L, "Smartwatch", "Fitness tracking smartwatch", 149.99),
	            new Product(116L, "Bluetooth Speaker", "Portable waterproof speaker", 59.99),
	            new Product(117L, "Power Bank", "10,000mAh USB-C", 39.99),
	            new Product(118L, "Laptop Stand", "Adjustable aluminum stand", 34.99),
	            new Product(119L, "HDMI Cable", "6ft high-speed HDMI", 12.99),
	            new Product(120L, "SSD", "512GB NVMe M.2 SSD", 89.99),
	            new Product(121L, "RAM", "16GB DDR4", 64.99),
	            new Product(122L, "Graphics Card", "NVIDIA GeForce RTX 4060", 399.00),
	            new Product(123L, "CPU", "Intel Core i5 12th Gen", 229.99),
	            new Product(124L, "Motherboard", "ATX Z690 chipset", 179.95),
	            new Product(125L, "Power Supply", "650W 80+ Bronze", 69.99),
	            new Product(126L, "Computer Case", "Mid-tower ATX case", 89.50),
	            new Product(127L, "Thermal Paste", "High-performance paste", 9.99),
	            new Product(128L, "Cooling Fan", "120mm case fan", 14.99),
	            new Product(129L, "Graphics Tablet", "Drawing tablet with pen", 79.99),
	            new Product(130L, "Docking Station", "USB-C multi-port hub", 99.00)
	        );
	}

}
