package iocode.web.app.IOBANK.repository;

import iocode.web.app.IOBANK.Entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,String> {
}
