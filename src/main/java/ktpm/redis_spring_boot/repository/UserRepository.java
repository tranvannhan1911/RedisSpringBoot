package ktpm.redis_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ktpm.redis_spring_boot.entity.User;


public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
