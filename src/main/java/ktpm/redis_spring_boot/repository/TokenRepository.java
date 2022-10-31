package ktpm.redis_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ktpm.redis_spring_boot.entity.Token;


public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
