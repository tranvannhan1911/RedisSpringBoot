package ktpm.redis_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ktpm.redis_spring_boot.entity.Product;
import ktpm.redis_spring_boot.service.ProductService;

@RestController
public class Controller {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product")
    @PreAuthorize("hasAnyAuthority('READ')")
	public Product getProduct() {
		Product product = productService.getProduct();
		return product;
	}
	

	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		product = productService.createProduct(product);
		return product;
	}
}
