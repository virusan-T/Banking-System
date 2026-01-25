package iocode.web.app.IOBANK.Entity;

import jakarta.persistence.*;

import lombok.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String accountId;

    private double balance;

    private String accountName;

    @Column(nullable = false, unique = true)
    private long  accountNumber;

    // Currency details
    private String currencyCode;   // e.g. LKR, USD
    private String currencyLabel;  // e.g. Sri Lankan Rupee
    private char currencySymbol; // e.g. Rs, $

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "account",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Transaction> transactions;
}
