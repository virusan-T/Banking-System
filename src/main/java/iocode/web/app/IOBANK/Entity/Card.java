package iocode.web.app.IOBANK.Entity;

import jakarta.persistence.*;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String cardID;

    @Column(nullable = false, unique = true)
    private long cardNumber;

    private String cardHolder;
    private double balance;
    @CreationTimestamp
    private LocalDate issueDate;

    @UpdateTimestamp
    private LocalDateTime UpdatedAt;
    private LocalDateTime expiryDate;

    private String cvv;

    private String pin;

    private String billingAddress;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Transaction> transactions;
}
