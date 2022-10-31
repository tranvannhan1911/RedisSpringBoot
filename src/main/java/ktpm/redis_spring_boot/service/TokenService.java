package ktpm.redis_spring_boot.service;

import ktpm.redis_spring_boot.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
