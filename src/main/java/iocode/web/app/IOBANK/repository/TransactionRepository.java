package iocode.web.app.IOBANK.repository;

import iocode.web.app.IOBANK.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
