package ktpm.redis_spring_boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ktpm.redis_spring_boot.entity.Product;

@Repository
public interface ProductRepository  extends CrudRepository<Product, String> {
	
}
