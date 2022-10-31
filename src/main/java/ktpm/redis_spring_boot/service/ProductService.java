package ktpm.redis_spring_boot.service;

import ktpm.redis_spring_boot.entity.Product;

public interface ProductService {
	Product createProduct(Product product);
	Product getProduct();
}
