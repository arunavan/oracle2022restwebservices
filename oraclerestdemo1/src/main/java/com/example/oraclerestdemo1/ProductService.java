package com.example.oraclerestdemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductService {
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProductDetails() {
		Product p=new Product(101,"Bag",900.00);
		Product p1=new Product(101,"Bag",900.00);
		Product p2=new Product(101,"Bag",900.00);
		List<Product> l=Arrays.asList(p,p1,p2);
		return new ResponseEntity(l,HttpStatus.OK);  //xml , json
		
	}
	
	@GetMapping("/add/{a}/{b}")
	public String getSum(@PathVariable Integer a,@PathVariable Integer b) {
		int s=a+b;
		return "Sum="+s;
	}

}
