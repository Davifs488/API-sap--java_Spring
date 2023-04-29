package com.dvalunosuper.executar.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvalunosuper.executar.entities.Department;
import com.dvalunosuper.executar.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@GetMapping
	public List<Product> getObjects() {
		Department d1 = new Department(1L, "Tech");
		Department d2 = new Department(2L, "Pet");
		Department d3 = new Department(3L, "Auto");
		
		
	   Product p1 = new Product(1L, "Macbook Pro", 4000.0, d1);
	   Product p2 = new Product(2L, "Macbook Super", 5000.0, d1);
	   Product p3 = new Product(3L, "Pc Games", 3000.0, d1);
	   Product p4 = new Product(4L, "Pet House", 300.0, d2);
	   Product p5 = new Product(5L, "Pet Tosa", 600.0, d2);
	   Product p6 = new Product(6L, "Gol gl", 13000.0, d3);
	   Product p7 = new Product(7L, "Fusca", 9000.0, d3);
		
	   List<Product>list = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
	   return list;
	}
}
