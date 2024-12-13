package org.example.libiarysystem.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "promoted_order")
@Data
public class PromotedOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "promo_id", nullable = false)
    private Promo promo;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
