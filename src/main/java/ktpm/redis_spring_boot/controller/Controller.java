package ktpm.redis_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ktpm.redis_spring_boot.entity.Product;
import ktpm.redis_spring_boot.service.ProductService;


//@Component
@RestController
public class Controller {
	@Autowired
	private ProductService productService;
	
    @Autowired
    private RedisTemplate template;
	
	@GetMapping("/product/{prodId}/")
//    @PreAuthorize("hasAnyAuthority('READ')")
	public Product getProduct(@PathVariable("prodId") String prodId) {
//		Product product = productService.getProduct();
		Product product = (Product) template.opsForHash().get("user", prodId);
		return product;
	}
	

	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		product = productService.createProduct(product);
		template.opsForHash().put("product", product.getProId(), product);
		return product;
	}
}
