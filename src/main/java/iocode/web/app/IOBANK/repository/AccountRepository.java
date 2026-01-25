package iocode.web.app.IOBANK.repository;

import iocode.web.app.IOBANK.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
}
