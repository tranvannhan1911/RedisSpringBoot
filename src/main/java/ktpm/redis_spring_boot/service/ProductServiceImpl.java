package ktpm.redis_spring_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ktpm.redis_spring_boot.entity.Product;
import ktpm.redis_spring_boot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProduct() {
		List<Product> products = (List<Product>) productRepository.findAll(); 
		return products.get(0);
	}

}
