package ktpm.redis_spring_boot.service;

import ktpm.redis_spring_boot.authen.UserPrincipal;
import ktpm.redis_spring_boot.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
