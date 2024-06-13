package br.com.valdir.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.valdir.producer.services.ProductService;
import dtos.ProductDTO;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService stringService;
	
	@PostMapping("/product")
	public ResponseEntity<String> sendMessage(@RequestBody ProductDTO productDto) {
		stringService.sendMessage(productDto);
		return ResponseEntity.ok("Sending Message");
	}
}
