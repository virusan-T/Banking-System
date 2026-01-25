package iocode.web.app.IOBANK.repository;

import iocode.web.app.IOBANK.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserNameIgnoreCase(String userName);
}
